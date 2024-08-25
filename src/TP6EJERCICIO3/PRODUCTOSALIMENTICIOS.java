/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TP6EJERCICIO3;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public interface PRODUCTOSALIMENTICIOS extends PRODUCTO {
    LocalDate getFechaVencimiento();
    boolean estaProximoAVencer();
}
    

