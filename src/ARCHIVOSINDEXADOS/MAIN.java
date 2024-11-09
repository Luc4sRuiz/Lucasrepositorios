/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS;

import static ARCHIVOSINDEXADOS.INDEXADOS.createDatabase;
import static ARCHIVOSINDEXADOS.INDEXADOS.createIndex;
import static ARCHIVOSINDEXADOS.INDEXADOS.insertRecords;
import static ARCHIVOSINDEXADOS.INDEXADOS.searchById;

/**
 *
 * @author Lucas
 */
public class MAIN {
        // Método principal para ejecutar el ejemplo
    public static void main(String[] args) {
        createDatabase();    // Crear la base de datos y tabla
        insertRecords();     // Insertar registros
        createIndex();       // Crear índice
        searchById(101);     // Buscar un registro por ID
    }
}

