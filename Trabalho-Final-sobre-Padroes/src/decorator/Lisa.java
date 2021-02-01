package decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class Lisa extends CamisetaDecorator {

    public Lisa(CamisetaPadrao umaCamiseta) {
        super(umaCamiseta);
        nome = "Lisa";
        preco = 2.0;
    }

}
