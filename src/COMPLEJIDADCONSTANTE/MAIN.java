package COMPLEJIDADCONSTANTE;
 import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class MAIN {  
    public static Integer obtenerPrimerElemento(ArrayList<Integer> lista) {
        // Verificamos si la lista no está vacía
        if (!lista.isEmpty()) {
            // Devolvemos el primer elemento de la lista
            return lista.get(0);
        } else {
            // Si la lista está vacía, retornamos null
            return null;
        }
    }

    public static void main(String[] args) {
        // Lista de ejemplo
        ArrayList<Integer> miLista = new ArrayList<>();
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);

        // Llamada a la función
        Integer resultado = obtenerPrimerElemento(miLista);

        System.out.println("Primer elemento: " + resultado);  // Salida esperada: 10
    }
}

