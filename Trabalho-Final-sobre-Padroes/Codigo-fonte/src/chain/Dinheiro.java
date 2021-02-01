/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author diego
 */
public class Dinheiro extends PagamentoChain {

    public Dinheiro() {
        super(IDPagamento.dinheiro);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("\nPagamento da venda recebido com dinheiro");
    }
}
