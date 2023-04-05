/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia4recorrer_numeros;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2Guia4Recorrer_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

        Scanner sc = new Scanner(System.in);

        int vec[] = new int[5];
        int num, i, cont;

        for (i = 0; i < 5; i++) {
            System.out.println("ingrese un valor para la posicion " + i + ":");
            num = sc.nextInt();
            vec[i] = num;
        }

        for (i = 0; i < 5; i++) {

            if (vec[i] < 10) {
                System.out.println(vec[i] + " Tiene 1 dígito");
            } else if (vec[i] >= 10 && vec[i] <= 99) {
                System.out.println(vec[i] + " Tiene 2 digitos");
            } else if (vec[i] >= 100 && vec[i] <= 999) {
                System.out.println(vec[i] + " Tiene 3 digitos");
            } else if (vec[i] >=1000 && vec[i] <= 9999) {
                System.out.println(vec[i] + " Tiene 4 digitos");
            } else if (vec[i] >= 10000 && vec[i] < 99999) {
                System.out.println(vec[i] + " Tiene 5 digitos");
           
            }

        }
    }
}