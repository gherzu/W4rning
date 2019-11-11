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
public class Validador {
    private String correo;
    private String pass;
    private String vcorreo;
    private String vpass;
    private boolean check = false;
        
    public void validar(){
        if (correo.equals(vcorreo) && pass.equals(vpass)) {
            check = true;
        } else { 
            check = false; 
        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setVcorreo(String vcorreo) {
        this.vcorreo = vcorreo;
    }

    public void setVpass(String vpass) {
        this.vpass = vpass;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return pass;
    }

    public String getVcorreo() {
        return vcorreo;
    }

    public String getVpass() {
        return vpass;
    }
    
    public Boolean getCheck() {
        return check;
    }
}
