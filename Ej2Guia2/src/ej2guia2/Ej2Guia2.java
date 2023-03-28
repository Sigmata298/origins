/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*2.	Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de
        Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.*/


Scanner leer=new Scanner (System.in);

       System.out.println("Escribir la palabra secreta: ");
       String palabra = leer.nextLine();
       
       
       if (palabra.equals("eureka"))
       {
           System.out.println("Correcto, culiau ");
    }
       else
       {
           System.out.println("Le erraste pa´la bosta... ");
       }}
    
}
