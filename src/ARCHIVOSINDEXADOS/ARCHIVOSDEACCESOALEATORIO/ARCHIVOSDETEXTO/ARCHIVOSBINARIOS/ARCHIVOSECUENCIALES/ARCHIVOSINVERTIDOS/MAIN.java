/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS.ARCHIVOSDEACCESOALEATORIO.ARCHIVOSDETEXTO.ARCHIVOSBINARIOS.ARCHIVOSECUENCIALES.ARCHIVOSINVERTIDOS;

/**
 *
 * @author Lucas
 */
public class MAIN {
     public static void main(String[] args) {
        ARCHIVONVERTIDO archivoInvertido = new ARCHIVONVERTIDO();

        // Ejemplo de documentos
        archivoInvertido.agregarDocumento(1, "Este es un documento de ejemplo");
        archivoInvertido.agregarDocumento(2, "Este documento es otro ejemplo");
        archivoInvertido.agregarDocumento(3, "El archivo invertido permite búsquedas rápidas");

        // Mostrar el índice invertido
        archivoInvertido.mostrarIndice();

        // Ejemplo de búsqueda
        System.out.println("Búsqueda de 'documento': " + archivoInvertido.buscarPalabra("documento"));
    }
}

