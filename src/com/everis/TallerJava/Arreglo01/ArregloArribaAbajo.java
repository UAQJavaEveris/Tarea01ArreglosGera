/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Arreglo01;

/**
 *
 * @author Berserker
 */
public class ArregloArribaAbajo {
    private int Arreglo[];

    public ArregloArribaAbajo() {
    }

    public ArregloArribaAbajo(int[] Arreglo) {
        this.Arreglo = Arreglo;
    } 
    
    public int sumar(int[] arreglo){
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }
}
