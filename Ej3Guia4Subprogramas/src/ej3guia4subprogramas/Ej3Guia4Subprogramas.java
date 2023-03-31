/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia4subprogramas;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Ej3Guia4Subprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a
dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá
ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("== Calculadora conversora de divisas ==");
        System.out.println("=======================================");

        System.out.println("Ingrese un valor en Euros");
        double euros = sc.nextDouble();

        double yenes = retornoyenes(euros);
        System.out.println(euros + " Euros son " + yenes + " yenes");

        double libra = retornolibras(euros);
        System.out.println(euros + " Euros son " + libra + " libras");
        
        double dolar= retornodolar(euros);
        System.out.println(euros + " Euros son " + dolar + " libras");

    }

    public static double retornoyenes(double euros) {

        double yenes = euros * 129852;

        return yenes;

    }

    public static double retornolibras(double euros) {

        Double libra = euros * 0.86;

        return libra;
    }
    
    public static double retornodolar(double euros){
        
        double dolar= euros * 1.28611;
        
        
        return dolar;
    }
}
