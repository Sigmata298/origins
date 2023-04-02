/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_guia4subprogramas.nombres_de_personas;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2_Guia4SubprogramasNombres_de_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores
o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
        ingrese la palabra “No”.    */

        Scanner sc = new Scanner(System.in);
        String resp;

        do {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = sc.next();

            System.out.println("Ingrese la edad de " + nombre);
            int edad = sc.nextInt();

            datosPersonales(nombre, edad);

            System.out.println("¿ Desea realizar un nuevo ingreso? (S/N)");
            resp = sc.next();

        } while (!resp.equals("n"));
    }

    public static void datosPersonales(String nombre, int edad) {

        Scanner sc = new Scanner(System.in);

        System.out.println(nombre + " tiene " + edad + " años");

        if (edad >= 18) {
            System.out.println("por lo tanto, es mayor de edad");
        } else {
            System.out.println("Por lo tanto, es menor de edad");
        }
    }
}
