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
public class CincoCent extends MoedaChain {

    public CincoCent() {
        super(IDMoedas.cincoCent);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Foi identificada uma moeda de 5 centavos");
    }
}
