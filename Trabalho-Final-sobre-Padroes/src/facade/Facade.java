/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Proxy.BancoProxy;

/**
 *
 * @author diego
 */
public class Facade {

    public String autenticacao_usuario(String usuario, String senha) {
        BancoProxy banco = new BancoProxy(usuario, senha);

        return banco.getUsuario();
    }
    
}
