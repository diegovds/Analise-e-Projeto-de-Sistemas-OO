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
public class Estampada extends CamisetaDecorator {

    public Estampada(CamisetaPadrao umaCamiseta) {
        super(umaCamiseta);
        nome = "Estampa";
        preco = 4.0;
    }

}
