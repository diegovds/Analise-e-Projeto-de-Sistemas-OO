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
public class UmReal extends MoedaChain {

    public UmReal() {
        super(IDMoedas.umReal);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Foi identificada uma moeda de 1 real");
    }
}
