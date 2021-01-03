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
public class VinteECincoCent extends MoedaChain {

    public VinteECincoCent() {
        super(IDMoedas.vinteECincoCent);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Foi identificada uma moeda de 25 centavos");
    }
}
