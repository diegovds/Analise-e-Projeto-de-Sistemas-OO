/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author diego
 */
public abstract class Refrigerante {
    
    protected TamanhoRefrigerante tamanho;
    
    public Refrigerante(TamanhoRefrigerante r) {
        tamanho = r;
    }

    public void exibeRefrigerante(String titulo) {
	tamanho.exibeRefrigerante(titulo);
    }

    public abstract void exibe();
}
