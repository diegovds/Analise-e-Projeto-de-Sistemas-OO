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
public abstract class PagamentoChain {

    protected PagamentoChain next;
    protected IDPagamento identificadorDoPagamento;

    public PagamentoChain(IDPagamento id) {
        next = null;
        identificadorDoPagamento = id;
    }

    public void setNext(PagamentoChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }

    public void efetuarPagamento(IDPagamento id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();
        } else {
            if (next == null) {
                throw new Exception("Forma de pagamento não cadastrada");
            }
            next.efetuarPagamento(id);
        }
    }

    private boolean podeEfetuarPagamento(IDPagamento id) {
        if (identificadorDoPagamento == id) {
            return true;
        }
        return false;
    }

    protected abstract void efetuaPagamento();

}
