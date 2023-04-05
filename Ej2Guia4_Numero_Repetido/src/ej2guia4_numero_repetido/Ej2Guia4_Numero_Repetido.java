/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia4_numero_repetido;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2Guia4_Numero_Repetido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido*/

        Scanner sc = new Scanner(System.in);

        int vector[] = new int[15];
        
        int i, j, num, cont = 0;

        for (i = 0; i < 15; i++) {
            vector[i] = (int) (Math.random() * 100);

        }

        for (i = 0; i < 15; i++) {

            System.out.print(vector[i] + " ");

        }
        System.out.println("");

        System.out.println("Ingrese un valor a encontrar: ");
        num = sc.nextInt();

        for (i = 0; i < 15; i++) {
            if (num == vector[i]) {
                System.out.println("El numero se encuentra en la posición " + i);
            }

        }
    }
}
