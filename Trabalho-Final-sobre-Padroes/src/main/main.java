package main;

import bridge.Camiseta;
import bridge.CamisetaEstampada;
import bridge.CamisetaListrada;
import bridge.CamisetaLisa;
import bridge.TamanhoCamisetaP;
import bridge.TamanhoCamisetaM;
import bridge.TamanhoCamisetaG;
import chain.IDPagamento;
import facade.Facade;

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

        Facade f = new Facade();
        double total = 0.0;
        
        if (f.autenticacao_usuario("marcos", "12345") != null) {
            System.out.println("Usuário: " + f.autenticacao_usuario("marcos", "12345"));
            System.out.println("\nLista de vendas:");

            Camiseta camiseta = new CamisetaEstampada(new TamanhoCamisetaP());
            total = total + f.registra_venda(camiseta);

            camiseta = new CamisetaEstampada(new TamanhoCamisetaG());
            total = total + f.registra_venda(camiseta);

            camiseta = new CamisetaLisa(new TamanhoCamisetaM());
            total = total + f.registra_venda(camiseta);

            camiseta = new CamisetaListrada(new TamanhoCamisetaP());
            total = total + f.registra_venda(camiseta);

            System.out.println("\nTotal da venda = " + total + "\n");

            f.registra_pagamento(IDPagamento.dinheiro);

        } else {
            System.out.println("Usuário não encontrado");
        }
        System.out.println();
    }

}
