/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariois;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Yohana Padilla
 */
public class Conexion {
    Connection conectar = null;
    
    String usuario = "root";
    String contra ="";
    String bd = "inventarios";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contra);
            JOptionPane.showMessageDialog(null,"La conexion se a realizado con exito");
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error a conectar a la base de datos: "+ e.toString());   
        }
        
        return conectar;
    }
}
