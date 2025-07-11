/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariois;

/**
 *
 * @author Strella Castro
 */

import java.sql.Connection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.util.*;

public class ReporteUsuarios {

    public static void main(String[] args) {
        try {
            // Ruta del archivo .jasper 
            String ruta = "src/Reportes/ReporteUsuarios.jasper";

            // Parámetros 
            Map<String, Object> parametros = new HashMap<>();

            // Conexión a la base de datos
            Conexion conexion = new Conexion();
            Connection conn = conexion.estableceConexion();

            // Llenar el reporte
            JasperPrint print = JasperFillManager.fillReport(ruta, parametros, conn);

            // Mostrarlo
            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
        }
    }
}
