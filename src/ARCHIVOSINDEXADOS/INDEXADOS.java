/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS;
import java.sql.*;
/**
 *
 * @author Lucas
 */
public class INDEXADOS {
    // Crear base de datos y tabla
    public static void createDatabase() {
        String url = "jdbc:sqlite:data.db";  // URL de conexión a la base de datos
        
        // SQL para crear la tabla
        String sql = "CREATE TABLE IF NOT EXISTS records (\n"
                + " id INTEGER PRIMARY KEY,\n"
                + " nombre TEXT,\n"
                + " apellido TEXT,\n"
                + " edad INTEGER\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url); 
             Statement stmt = conn.createStatement()) {
            // Ejecutar la creación de la tabla
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Insertar registros
    public static void insertRecords() {
        String url = "jdbc:sqlite:data.db";
        
        // SQL para insertar registros
        String sql = "INSERT OR IGNORE INTO records(id, nombre, apellido, edad) VALUES(?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Insertar varios registros
            Object[][] records = {
                {101, "Juan", "Perez", 25},
                {102, "Ana", "Gomez", 30},
                {103, "Luis", "Mendez", 45}
            };
            
            // Iterar sobre los registros y agregarlos
            for (Object[] record : records) {
                pstmt.setInt(1, (Integer) record[0]);
                pstmt.setString(2, (String) record[1]);
                pstmt.setString(3, (String) record[2]);
                pstmt.setInt(4, (Integer) record[3]);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Buscar un registro por ID
    public static void searchById(int recordId) {
        String url = "jdbc:sqlite:data.db";
        String sql = "SELECT * FROM records WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, recordId);
            ResultSet rs = pstmt.executeQuery();
            
            // Obtener el resultado de la consulta
            if (rs.next()) {
                System.out.println("Registro encontrado: ID = " + rs.getInt("id") +
                                   ", Nombre = " + rs.getString("nombre") +
                                   ", Apellido = " + rs.getString("apellido") +
                                   ", Edad = " + rs.getInt("edad"));
            } else {
                System.out.println("No se encontró el registro con ID: " + recordId);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Crear índice para optimizar búsqueda por ID
    public static void createIndex() {
        String url = "jdbc:sqlite:data.db";
        String sql = "CREATE INDEX IF NOT EXISTS idx_id ON records(id)";
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
