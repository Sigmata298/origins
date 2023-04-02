/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13practica_;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio13Practica_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante*/

        Scanner sc = new Scanner(System.in);

        String[] equipo = new String[3];
        String nombre;
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de los integrantes del equipo");
            nombre=sc.nextLine();
            
            equipo[i] = nombre;
            

        }
    }

}
