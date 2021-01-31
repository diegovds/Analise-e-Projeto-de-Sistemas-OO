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

public abstract class BancoChain {

	protected BancoChain next;
	protected IDBancos identificadorDoBanco;

	public BancoChain(IDBancos id) {
		next = null;
		identificadorDoBanco = id;
	}

	public void setNext(BancoChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void efetuarPagamento(IDBancos id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
		} else {
			if (next == null) {
				throw new Exception("Banco não cadastrado");
			}
			next.efetuarPagamento(id);
		}
	}

	private boolean podeEfetuarPagamento(IDBancos id) {
		if (identificadorDoBanco == id) {
			return true;
		}
		return false;
	}

	protected abstract void efetuaPagamento();

}
