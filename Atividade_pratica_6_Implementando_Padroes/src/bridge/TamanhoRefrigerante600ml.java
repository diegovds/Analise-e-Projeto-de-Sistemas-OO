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
public class TamanhoRefrigerante600ml implements TamanhoRefrigerante {
    
    @Override
    public void exibeRefrigerante(String titulo) {
	System.out.println(titulo + " : 600 ml");
    }
    
}
