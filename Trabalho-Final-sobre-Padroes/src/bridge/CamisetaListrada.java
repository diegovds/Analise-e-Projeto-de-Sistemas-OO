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
public class CamisetaListrada extends Camiseta {
    
    public CamisetaListrada(TamanhoCamiseta c) {
        super(c);
    }
    
    @Override
    public void exibe() {
        exibeCamiseta("Camiseta Listrada");
    }
    
}
