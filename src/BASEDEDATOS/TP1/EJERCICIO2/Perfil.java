/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASEDEDATOS.TP1.EJERCICIO2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Perfil {
    private String informacionPersonal;
    private List<String> intereses;
    private String biografia;

    public Perfil() {
        intereses = new ArrayList<>();
    }

    public void setInformacionPersonal(String info) {
        this.informacionPersonal = info;
    }

    public void setBiografia(String bio) {
        this.biografia = bio;
    }

    public void agregarInteres(String interes) {
        intereses.add(interes);
    }

    public List<String> getIntereses() {
        return intereses;
    }
}

