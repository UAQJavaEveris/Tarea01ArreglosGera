/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Tarea01;

import com.everis.TallerJava.Arreglo01.ArregloArribaAbajo;
import com.everis.TallerJava.Arreglo02.ArregloAbajoArriba;

/**
 *
 * @author Berserker
 */
public class Test {
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5};
        int arreglo2[] = {6,7,8,9,10};
        ArregloArribaAbajo arrArAb = new ArregloArribaAbajo();
        ArregloAbajoArriba arrAbAr = new ArregloAbajoArriba();
        System.out.println("La suma de arriba hacia abajo es: "+ arrArAb.sumar(arreglo));
        System.out.println("La suma de abajo hacia arriba es: "+arrAbAr.suma(arreglo2));
    }
}
