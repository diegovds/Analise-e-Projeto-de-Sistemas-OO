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
public class TamanhoCamisetaP implements TamanhoCamiseta {
    
    @Override
    public void exibeCamiseta(String titulo) {
	System.out.print(titulo + " - Tamanho P");
    }
    
}
