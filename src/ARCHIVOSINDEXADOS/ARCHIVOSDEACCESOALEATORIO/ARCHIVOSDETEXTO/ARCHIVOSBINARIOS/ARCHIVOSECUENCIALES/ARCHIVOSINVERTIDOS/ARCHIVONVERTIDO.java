/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOSINDEXADOS.ARCHIVOSDEACCESOALEATORIO.ARCHIVOSDETEXTO.ARCHIVOSBINARIOS.ARCHIVOSECUENCIALES.ARCHIVOSINVERTIDOS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Lucas
 */
public class ARCHIVONVERTIDO {
    // Mapa para el índice invertido
    private Map<String, List<Integer>> indiceInvertido;

    public ARCHIVONVERTIDO() {
        indiceInvertido = new HashMap<>();
    }

    // Método para agregar documentos al índice invertido
    public void agregarDocumento(int docId, String texto) {
        // Dividir el texto en palabras
        String[] palabras = texto.toLowerCase().split("\\s+");
        for (String palabra : palabras) {
            // Evitar duplicados en el mismo documento
            indiceInvertido.putIfAbsent(palabra, new ArrayList<>());
            if (!indiceInvertido.get(palabra).contains(docId)) {
                indiceInvertido.get(palabra).add(docId);
            }
        }
    }

    // Método para buscar una palabra en el índice invertido
    public List<Integer> buscarPalabra(String palabra) {
        return indiceInvertido.getOrDefault(palabra.toLowerCase(), new ArrayList<>());
    }

    // Mostrar índice invertido
    public void mostrarIndice() {
        System.out.println("Índice Invertido: " + indiceInvertido);
    }
    
}

   


