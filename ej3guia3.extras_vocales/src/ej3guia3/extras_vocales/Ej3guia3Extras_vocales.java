/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia3.extras_vocales;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej3guia3Extras_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
función equals() de la clase String.*/

        Scanner sc = new Scanner(System.in);

        String letra;

        System.out.println("Ingrese una vocal: ");
        letra = sc.nextLine();
        
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u") )
        {
            System.out.println("Correcto");
        }
        else{
            System.out.println(letra + " no es una vocal");
    }
    
}
}