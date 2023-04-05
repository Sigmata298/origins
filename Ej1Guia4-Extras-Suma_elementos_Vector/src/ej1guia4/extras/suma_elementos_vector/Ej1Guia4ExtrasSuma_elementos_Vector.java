/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia4.extras.suma_elementos_vector;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej1Guia4ExtrasSuma_elementos_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.*/
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        // Inicializo el vector: 
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        int i;

        int vec[] = new int[n];

        // relleno el vector :
        for (i = 0; i < n; i++) {
            System.out.println("Ingrese el valor para la posición " +( i+1));
            int pos = sc.nextInt();
            vec[i] = pos;
        }

        // imprimo el vector:
        for (i = 0; i < n; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println();
        //sumo subíndices: 
        for (i = 0; i < n; i++) {

            suma = suma + vec[i];
        }

        //imprimo:
        System.out.println("La suma de los valores ingresados es: " + suma);

    }

}
