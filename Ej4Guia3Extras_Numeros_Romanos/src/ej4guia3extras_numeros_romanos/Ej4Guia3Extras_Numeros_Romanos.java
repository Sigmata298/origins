/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia3extras_numeros_romanos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej4Guia3Extras_Numeros_Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.*/

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero del 1 al 10: ");
            num = sc.nextInt();

        } while (num >= 10);

        switch (num) {
            case 1:
                System.out.println("1 en romaro es I");
                break;
            case 2:
                System.out.println("2 en romaro es II");
                break;
            case 3:
                System.out.println("3 en romaro es III");
                break;
            case 4:
                System.out.println("4 en romaro es IV");
                break;
            case 5:
                System.out.println("5 en romaro es V");
                break;
            case 6:
                System.out.println("6 en romaro es VI");
                break;
            case 7:
                System.out.println("7 en romaro es VII");
                break;
            case 8:
                System.out.println("8 en romaro es VIII");
                break;
            case 9:
                System.out.println(" en romaro es IX");

                break;
            case 10:
                System.out.println("10 en romaro es X");
                break;

            default:
                System.out.println("Se solicita un numero del 1 al 10");
    }
    
}
}