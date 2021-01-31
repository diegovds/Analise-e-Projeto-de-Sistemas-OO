package main;

import Proxy.BancoProxy;
import bridge.Camiseta;
import bridge.CamisetaEstampada;
import bridge.CamisetaListrada;
import bridge.CamisetaLisa;
import bridge.TamanhoCamisetaP;
import bridge.TamanhoCamisetaM;
import bridge.TamanhoCamisetaG;
import chain.BancoA;
import chain.BancoB;
import chain.BancoChain;
import chain.IDBancos;

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
    public static void main(String[] args) throws Exception {

        BancoChain bancos = new BancoA();
        bancos.setNext(new BancoB());
        
        BancoProxy banco = new BancoProxy("marcos", "12345");
        
        if (banco.getUsuario() != null) {
            System.out.println("Usuário: " + banco.getUsuario());
            System.out.println("\nLista de compras:");

            Camiseta camiseta = new CamisetaEstampada(new TamanhoCamisetaP());
            camiseta.exibe();
            camiseta = new CamisetaEstampada(new TamanhoCamisetaM());
            camiseta.exibe();

            camiseta = new CamisetaLisa(new TamanhoCamisetaG());
            camiseta.exibe();

            camiseta = new CamisetaListrada(new TamanhoCamisetaM());
            camiseta.exibe();

            System.out.println();

            bancos.efetuarPagamento(IDBancos.bancoB);

        } else {
            System.out.println("Usuário sem acesso");
        }
        System.out.println();
    }

}
