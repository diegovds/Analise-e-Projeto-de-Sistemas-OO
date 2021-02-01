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
        System.out.println(" - R$" + preco);
        total = total + preco;

        camiseta = new CamisetaEstampada(new TamanhoCamisetaG());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" - R$" + preco);
        total = total + preco;

        camiseta = new CamisetaLisa(new TamanhoCamisetaM());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" - R$" + preco);
        total = total + preco;

        camiseta = new CamisetaListrada(new TamanhoCamisetaP());
        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" - R$" + preco);
        total = total + preco;

        return total;

    }

    public void registra_pagamento() throws Exception {
        PagamentoChain pagamentos = new Dinheiro();
        pagamentos.setNext(new Cartao());

        pagamentos.efetuarPagamento(IDPagamento.dinheiro);
    }

}
