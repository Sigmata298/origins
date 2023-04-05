/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2guia4.extra.comparación_de_vectores;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class E2Guia4ExtraComparación_de_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).    */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del vector 1");
        int n = sc.nextInt();

        /*        System.out.println("Ingrese la longitud del vector 2");
       int  n2 = sc.nextInt(); */
        int vec[] = new int[n];
        int vec2[] = new int[n];

        System.out.println("Ingresando valores de vector 1");

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese el valor de " + (i + 1));
            vec[i] = sc.nextInt();
        }

        System.out.println("Ingresando valores de vector 2");

        for (int i = 0; i < vec2.length; i++) {
            System.out.println("Ingrese el valor de " + (i + 1));
            vec2[i] = sc.nextInt();
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");

        for (int i = 0; i < vec.length; i++) {
            System.out.print("[" + vec2[i] + "]");
        }
        System.out.println("");

        boolean sonIguales = true;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] != vec2[i]) {

                System.out.println("Los vectores no son iguales");
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales");
        }

        System.out.println("Determinando si son iguales por una función");

        System.out.println("¿Los vectores son iguales? " + vectoresIguales(vec, vec2));

        sonIguales = vectoresIguales(vec, vec2);

        if (sonIguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }

    }

    public static boolean vectoresIguales(int vec1[], int vec2[]) {

        for (int i = 0; i < vec1.length; i++) {
            if (vec1[i] != vec2[i]) {
                return false;
            }
        }

        return true;
    }
}
