/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bárbara Viridiana Lara Espinosa
 */
public class ComentariosDAO {
    private Connection conexion;
    
    private void abrirConexion() throws SQLException{
        String URLDB = "jdbc:derby://localhost:1527/Comentarios";
        String username = "fcfm";
        String password = "lsti01";
        conexion = DriverManager.getConnection(URLDB, username, password);
    }
    
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    
    public void  insertar(ComentariosPOJO pojo){
        try {
            abrirConexion();
            String sql = "insert into COMENTARIOS values (\'" + pojo.getNombre() + "\', \'" + pojo.getComentario() + "\')";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.print("Hubo un problema");
        }
    }
    
    public List buscar(ComentariosPOJO pojo){
        ResultSet result;
        List beans = new ArrayList();
        try {
            abrirConexion();
            String sql = "select * from COMENTARIOS where NOMBRE = \'" + pojo.getNombre() + "\' and COMENTARIO like \'%" + pojo.getComentario() + "%\'";
            Statement stmt = conexion.createStatement();
            result = stmt.executeQuery(sql);
            while(result.next()){
                String nombre = result.getString("NOMBRE");
                String comentario = result.getString("COMENTARIO");
                ComentariosPOJO compojo = new ComentariosPOJO();
                compojo.setNombre(nombre);
                compojo.setComentario(comentario);
                beans.add(compojo);
            }
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.print("Hubo un problema");
        }
        return beans;
    }
}
