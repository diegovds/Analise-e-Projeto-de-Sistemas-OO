package main;

import bridge.Camiseta;
import bridge.CamisetaEstampada;
import bridge.CamisetaListrada;
import bridge.CamisetaLisa;
import bridge.TamanhoCamisetaP;
import bridge.TamanhoCamisetaM;
import bridge.TamanhoCamisetaG;
import chain.Cartao;
import chain.Dinheiro;
import chain.IDPagamento;
import chain.PagamentoChain;
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
        double total = 0.0, preco;
        PagamentoChain pagamentos = new Dinheiro();
        pagamentos.setNext(new Cartao());

        if (f.autenticacao_usuario("marcos", "12345") != null) {
            System.out.println("Usuário: " + f.autenticacao_usuario("marcos", "12345"));
            System.out.println("\nLista de vendas:");

            Camiseta camiseta = new CamisetaEstampada(new TamanhoCamisetaP());
            camiseta.exibe();
            preco = camiseta.getPreco();
            System.out.println(" - R$" + preco);
            total = total + preco;

            camiseta = new CamisetaEstampada(new TamanhoCamisetaM());
            camiseta.exibe();
            preco = camiseta.getPreco();
            System.out.println(" - R$" + preco);
            total = total + preco;

            camiseta = new CamisetaLisa(new TamanhoCamisetaG());
            camiseta.exibe();
            preco = camiseta.getPreco();
            System.out.println(" - R$" + preco);
            total = total + preco;

            camiseta = new CamisetaListrada(new TamanhoCamisetaM());
            camiseta.exibe();
            preco = camiseta.getPreco();
            System.out.println(" - R$" + preco);
            total = total + preco;

            System.out.println("\nTotal da venda = " + total + "\n");

            pagamentos.efetuarPagamento(IDPagamento.dinheiro);

        } else {
            System.out.println("Usuário não encontrado");
        }
        System.out.println();
    }

}
