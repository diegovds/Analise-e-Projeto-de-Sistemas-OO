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

public class BancoB extends BancoChain {

	public BancoB() {
		super(IDBancos.bancoB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento autorizado no banco B");
	}

}
