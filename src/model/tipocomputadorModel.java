package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.tipocomputador;
import util.MySqlDBConexion; // Ajusta según la ruta exacta de tu clase de conexión

public class tipocomputadorModel {

    public List<tipocomputador> listarTipoComputador() {
        List<tipocomputador> listaTipoComputador = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            // 1. Crear la conexión
            conn = MySqlDBConexion.getConexion(); // O Conexion.getConnection() según tu proyecto
            
            // 2. Crear la sentencia SQL
            String sql = "SELECT * FROM tipocomputador";
            stmt = conn.prepareStatement(sql);
            
            // 3. Ejecutar sentencia SQL
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                tipocomputador tipoComputador = new tipocomputador();
                // Verifica que los setters coincidan con los de tu clase entity.tipocomputador
                tipoComputador.setIdTipoComputador(rs.getInt("idTipoComputador"));
                tipoComputador.setNombreTipo(rs.getString("nombreTipo"));
                
                listaTipoComputador.add(tipoComputador);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   
        return listaTipoComputador;
    }

}
