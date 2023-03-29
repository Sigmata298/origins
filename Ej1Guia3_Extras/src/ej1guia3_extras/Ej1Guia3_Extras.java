/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia3_extras;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej1Guia3_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

        Scanner leer = new Scanner(System.in);

        int t;
        int dias, horas;

        System.out.println("Ingrese el tiempo a calcular (en minutos)");
        t = leer.nextInt();

        horas = t/60;
        dias = horas / 24;
        
        System.out.print(+t);System.out.print(" minutos es equivalente a "); System.out.print(+dias); System.out.print(" dias "); System.out.print(+horas);System.out.println(" horas");
                
    }

}
