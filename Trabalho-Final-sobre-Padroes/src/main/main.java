package main;

import Proxy.BancoProxy;
import bridge.Camiseta;
import bridge.CamisetaMarcaX;
import bridge.CamisetaMarcaY;
import bridge.CamisetaMarcaZ;
import bridge.TamanhoCamisetaG;
import bridge.TamanhoCamisetaM;
import bridge.TamanhoCamisetaP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BancoProxy banco = new BancoProxy("marcos", "12345");
        if (banco.getUsuario() != null) {
            System.out.println("Usuário: " + banco.getUsuario());
            System.out.println("Lista de compras:\n");
            
            Camiseta camiseta = new CamisetaMarcaX(new TamanhoCamisetaP());
            camiseta.exibe();
            camiseta = new CamisetaMarcaX(new TamanhoCamisetaM());
            camiseta.exibe();
            
            camiseta = new CamisetaMarcaY(new TamanhoCamisetaG());
            camiseta.exibe();
            
            camiseta = new CamisetaMarcaZ(new TamanhoCamisetaM());
            camiseta.exibe();
        
        } else {
            System.out.println("Usuário sem acesso");
        }

    }

}
