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

public class BancoA extends BancoChain {

	public BancoA() {
		super(IDBancos.bancoA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento autorizado no banco A");
	}
}
