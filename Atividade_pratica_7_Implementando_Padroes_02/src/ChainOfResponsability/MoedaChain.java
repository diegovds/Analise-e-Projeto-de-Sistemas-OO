/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author diego
 */
public abstract class MoedaChain {

    protected MoedaChain next;
    protected IDMoedas identificadorDaMoeda;
    protected double valor;

    public MoedaChain(IDMoedas id) {
        next = null;
        identificadorDaMoeda = id;

        if (String.valueOf(id) == "umCent") {
            valor = 0.01;

        }
        if (String.valueOf(id) == "cincoCent") {
            valor = 0.05;

        }
        if (String.valueOf(id) == "dezCent") {
            valor = 0.1;

        }
        if (String.valueOf(id) == "vinteECincoCent") {
            valor = 0.25;

        }
        if (String.valueOf(id) == "cinquentaCent") {
            valor = 0.5;

        }
        if (String.valueOf(id) == "umReal") {
            valor = 1.0;

        }
    }

    public void setNext(MoedaChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }

    public void efetuarPagamento(IDMoedas id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();

        } else {
            if (next == null) {
                throw new Exception("moeda não cadastrada");
            }
            next.efetuarPagamento(id);
        }

    }

    public double getValorMoeda() {
        return this.valor;
    }

    private boolean podeEfetuarPagamento(IDMoedas id) {
        if (identificadorDaMoeda == id) {
            return true;
        }
        return false;
    }

    protected abstract void efetuaPagamento();

}
