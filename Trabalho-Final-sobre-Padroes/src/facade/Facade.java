/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Proxy.BancoProxy;
import chain.Cartao;
import chain.Dinheiro;
import chain.IDPagamento;
import chain.PagamentoChain;
import bridge.Camiseta;
import bridge.CamisetaEstampada;
import bridge.CamisetaListrada;
import bridge.CamisetaLisa;
import bridge.TamanhoCamisetaP;
import bridge.TamanhoCamisetaM;
import bridge.TamanhoCamisetaG;
import decorator.CamisetaBase;
import decorator.CamisetaPadrao;
import decorator.Estampada;
import decorator.Lisa;
import decorator.Listrada;

/**
 *
 * @author diego
 */
public class Facade {

    public String autenticacao_usuario(String usuario, String senha) {
        BancoProxy banco = new BancoProxy(usuario, senha);

        return banco.getUsuario();
    }

    public double registra_venda() {
        double preco, total = 0.0;

        Camiseta camiseta = new CamisetaEstampada(new TamanhoCamisetaP());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" = R$" + preco);
        total = total + preco;

        camiseta = new CamisetaEstampada(new TamanhoCamisetaG());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" = R$" + preco);
        total = total + preco;

        camiseta = new CamisetaLisa(new TamanhoCamisetaM());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" = R$" + preco);
        total = total + preco;

        camiseta = new CamisetaListrada(new TamanhoCamisetaP());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" = R$" + preco);
        total = total + preco;

        return total;

    }

    public void registra_pagamento() throws Exception {
        PagamentoChain pagamentos = new Dinheiro();
        pagamentos.setNext(new Cartao());

        pagamentos.efetuarPagamento(IDPagamento.dinheiro);
    }

    public double custo_das_camisetas() {
        double total = 0.0, preco;

        CamisetaPadrao camiseta0 = new CamisetaBase();
        camiseta0 = new Estampada(camiseta0);
        preco = camiseta0.getPreco();
        System.out.println(camiseta0.getNome() + " = R$" + preco);
        total = total + preco;

        CamisetaPadrao camiseta1 = new CamisetaBase();
        camiseta1 = new Estampada(camiseta1);
        preco = camiseta1.getPreco();
        System.out.println(camiseta1.getNome() + " = R$" + preco);
        total = total + preco;

        CamisetaPadrao camiseta2 = new CamisetaBase();
        camiseta2 = new Lisa(camiseta2);
        preco = camiseta2.getPreco();
        System.out.println(camiseta2.getNome() + " = R$" + preco);
        total = total + preco;

        CamisetaPadrao camiseta3 = new CamisetaBase();
        camiseta3 = new Listrada(camiseta3);
        preco = camiseta3.getPreco();
        System.out.println(camiseta3.getNome() + " = R$" + preco);
        total = total + preco;

        return total;

    }

}
