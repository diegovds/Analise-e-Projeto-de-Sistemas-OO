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

        double venda, custo;
        Facade f = new Facade();
        
        if (f.autenticacao_usuario("marcos", "12345") != null) {
            System.out.println("Usuário: " + f.autenticacao_usuario("marcos", "12345"));
            System.out.println("\nLista de vendas:");

            venda = f.registra_venda();
            f.registra_pagamento();
            System.out.println("\nTotal da venda = R$" + venda);
            
            System.out.println("\nInvestimento:");
            custo = f.custo_das_camisetas();
            System.out.println("\nTotal do investimento = R$" + custo);
            
            System.out.println("\nTotal do lucro com as vendas = R$" + (venda - custo));

        } else {
            System.out.println("Usuário não encontrado");
        }
        System.out.println();
    }

}
