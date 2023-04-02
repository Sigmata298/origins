/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int i;

        String[] equipo = new String[5];

        for (i = 0; i < 5; i++) {

            System.out.println("Ingrese en nombre del compañero " + (i+1) );

            String nombre = leer.next();
            equipo[i] = nombre;
        }

        for (i = 0; i < 5; i++) {
            System.out.println(equipo[i]);

        }

    }

}
