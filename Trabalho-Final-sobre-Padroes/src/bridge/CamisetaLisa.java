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
public class CamisetaLisa extends Camiseta {
    
    public CamisetaLisa(TamanhoCamiseta c) {
        super(c);
        preco = 20.0;
    }
    
    @Override
    public void exibe() {
        exibeCamiseta("Camiseta Lisa");
    }
    
}
