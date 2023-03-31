/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guiasubprogramas;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej1GuiaSubprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. */
        Scanner leer = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese un valor : ");
        num1 = leer.nextInt();

        System.out.println("Ingrese un valor : ");
        num2 = leer.nextInt();

        int retorno = sumar(num1, num2);
        System.out.println("La suma es " + retorno);

        int retornoresta = resta(num1, num2);
        System.out.println("la resta es: " + retornoresta);

        int retornomult = mult(num1, num2);
        System.out.println("La multiplicación es: " + retornomult);

        double retornodiv = div(num1, num2);
        System.out.println("La division es: " + retornodiv);
    }

    public static int sumar(int num1, int num2) {
        int suma = 0;
        suma = num1 + num2;

        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta = 0;
        resta = num1 - num2;

        return resta;
    }

    public static int mult(int num1, int num2) {
        int mult = 0;
        mult = num1 * num2;

        return mult;

    }

    public static double div(double num1, double num2) {
        double div = 0;
        div = num1 / num2;

        return div;
    }

}
