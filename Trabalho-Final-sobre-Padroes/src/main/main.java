package main;

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
        
        if (f.autenticacao_usuario("marcos", "12345") != null) {
            System.out.println("Usuário: " + f.autenticacao_usuario("marcos", "12345"));
            System.out.println("\nLista de vendas:");

            System.out.println("\nTotal da venda = " + f.registra_venda() + "\n");

            f.registra_pagamento();

        } else {
            System.out.println("Usuário não encontrado");
        }
        System.out.println();
    }

}
