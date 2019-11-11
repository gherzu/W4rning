/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

public class HerramientasDB {
    private final String url = "jdbc:derby://localhost:1527/practica";
    
    public HerramientaSolicitar Solicitar(){
        return new HerramientaSolicitar();
    }
    
    public HerramientaInsertar Insertar(){
        HerramientaInsertar ins= new HerramientaInsertar();
        return ins;
    }
    
    public HerramientaActualizar Actualizar(){
        HerramientaActualizar act= new HerramientaActualizar();
        return act;
    }
        
    public String getUrl() {
    return url;
    }
}
