/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hp1tb
 */
public class SingletonEmpresa {
    private static SingletonEmpresa instance = null;
    
    protected SingletonEmpresa() {
    }
    
    public static SingletonEmpresa getInstance () {
        if (instance==null){
            instance = new SingletonEmpresa();
        }
        return instance;
    }

    public String empresa() {
        String mensaje = "Chat With Everyting!";
        return mensaje;
   }
}