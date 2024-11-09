/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS.ARCHIVOSDEACCESOALEATORIO.ARCHIVOSDETEXTO.ARCHIVOSBINARIOS.ARCHIVOSECUENCIALES;
import java.io.*;

/**
 *
 * @author Lucas
 */
public class ESCRIBIR {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
            bw.write("Línea 1");
            bw.newLine();  // Añadir un salto de línea
            bw.write("Línea 2");
        } catch (IOException e) {
        }
    }
}


