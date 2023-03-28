/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia1;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
/*1.	Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int num1;
        int num2;
        int suma;
        
               Scanner scan = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        num1 =  scan.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = scan.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + suma );
    }
    
}
