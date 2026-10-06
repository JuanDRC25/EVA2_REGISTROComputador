package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import entity.sistemacomputadores;
import util.MySqlDBConexion;

public class computadorModel {

    public int insertacomputador(sistemacomputadores computador) {
        int resultado = 0;

        String sql = "INSERT INTO sistemacomputadores (nombre, codigo, marca, modelo, procesador, ram, discoDuro, precio, estado, idTipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = MySqlDBConexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, computador.getNombre());
            stmt.setString(2, computador.getCodigo());
            stmt.setString(3, computador.getMarca());
            stmt.setString(4, computador.getModelo());
            stmt.setString(5, computador.getProcesador());
            stmt.setString(6, computador.getRam());
            stmt.setString(7, computador.getDiscoDuro());
            stmt.setString(8, computador.getPrecio());

            // --- AQUÍ VA EL CÓDIGO DEL ESTADO ---
            // Si el estado viene vacío o no es un número (ej. "nuevo"), le asignamos "1" por defecto para MySQL
            String estado = computador.getEstado();
            if (estado == null || estado.trim().isEmpty() || !estado.matches("\\d+")) {
                estado = "1";
            }
            stmt.setString(9, estado);
            // ------------------------------------

            // Validación para idTipo
            if (computador.getTipocomputador() != null && computador.getTipocomputador().getIdTipoComputador() > 0) {
                stmt.setInt(10, computador.getTipocomputador().getIdTipoComputador());
            } else {
                stmt.setNull(10, Types.INTEGER);
            }

            // Ejecución de la sentencia
            resultado = stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al insertar en la base de datos: " + e.getMessage());
            e.printStackTrace();
        }

        return resultado;
    }
}
