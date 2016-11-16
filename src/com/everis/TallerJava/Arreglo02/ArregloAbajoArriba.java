/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Arreglo02;

/**
 *
 * @author Berserker
 */
public class ArregloAbajoArriba {

    public ArregloAbajoArriba() {
    }
    
    public int suma(int [] arreglo){
        int suma = 0;
        int j = 0;
        for (int i = arreglo.length; i > 0; i--) {
            suma += arreglo[j];
            j++;
        }
        return suma;
    }
}
