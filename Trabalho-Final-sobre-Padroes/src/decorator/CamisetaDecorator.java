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
public abstract class CamisetaDecorator extends CamisetaPadrao {

    CamisetaPadrao camiseta;

    public CamisetaDecorator(CamisetaPadrao umaCamiseta) {
        camiseta = umaCamiseta;
    }

    @Override
    public String getNome() {
        return camiseta.getNome() + " R$" + camiseta.getPreco() + " + " + nome + " R$" + preco; 
    }

    public double getPreco() {
        
        return camiseta.getPreco() + preco;
    }
}
