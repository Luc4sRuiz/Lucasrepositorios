/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas
 */
public class HISTORIAL {
 
    private List<String> registros;

    public HISTORIAL() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public List<String> obtenerRegistros() {
        return new ArrayList<>(registros);
    }
}

