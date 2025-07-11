/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariois;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conectar = null;

    // Datos de conexión
    String usuario = "root";
    String contra = ""; 
    String bd = "inventarios";
    String ip = "localhost";
    String puerto = "3306";

    // Cadena de conexión con zona horaria
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            conectar = DriverManager.getConnection(cadena, usuario, contra);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error al conectar: " + e.toString());
        }

        return conectar;
    }
}
