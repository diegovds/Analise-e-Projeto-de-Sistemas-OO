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

public class Cartao extends PagamentoChain {

	public Cartao() {
		super(IDPagamento.cartao);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento realizado com cartão");
	}

}
