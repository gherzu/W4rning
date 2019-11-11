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
public class HerramientaActualizar extends HerramientasDB{
    String query = "INSERT INTO ROOT.UNTITLED (ID, NOMBRE, APELLIDOPAT, APELLIDOMAT, CUMPLE, CORREO, CONTRASEÑA)";
    
    public String getActualizar() {
        return query;
    }
}

