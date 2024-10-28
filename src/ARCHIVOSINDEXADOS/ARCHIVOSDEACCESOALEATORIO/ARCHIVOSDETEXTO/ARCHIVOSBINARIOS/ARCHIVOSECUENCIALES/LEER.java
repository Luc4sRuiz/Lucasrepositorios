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
public class LEER {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


