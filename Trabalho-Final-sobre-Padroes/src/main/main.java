package main;

import Proxy.BancoProxy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        BancoProxy banco = new BancoProxy("marcos", "12345");
        System.out.println(banco.getUsuario());
    }
    
}
