/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8guia3cuadrado;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej8Guia3Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*       *
*       *
* * * *   */

        Scanner leer = new Scanner(System.in);
        int num, i, j;

        System.out.println("Ingrese la cantidad de * por lado:");
        num = leer.nextInt();

        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {

                if (i == 0 || i == (num - 1)) {
                    System.out.print("* ");

                } else {
                    if (j == 0 || j == (num - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

        }

    }
}
