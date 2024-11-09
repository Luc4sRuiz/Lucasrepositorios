/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS.ARCHIVOSDEACCESOALEATORIO.ARCHIVOSDETEXTO;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Lucas
 */
public class ESCRIBIR {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("archivo.txt");
            archivo.write("Este es el contenido del archivo de texto.\n");
            archivo.write("Esta es otra línea.\n");
            archivo.close();
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}

