/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Proxy.BancoProxy;
import bridge.Camiseta;
import chain.Cartao;
import chain.Dinheiro;
import chain.IDPagamento;
import chain.PagamentoChain;

/**
 *
 * @author diego
 */
public class Facade {

    public String autenticacao_usuario(String usuario, String senha) {
        BancoProxy banco = new BancoProxy(usuario, senha);

        return banco.getUsuario();
    }

    public double registra_venda(Camiseta camiseta) {
        double preco;

        camiseta.exibe();
        preco = camiseta.getPreco();
        System.out.println(" - R$" + preco);

        return preco;

    }

    public void registra_pagamento(IDPagamento p) throws Exception {
        PagamentoChain pagamentos = new Dinheiro();
        pagamentos.setNext(new Cartao());

        pagamentos.efetuarPagamento(p);
    }

}
