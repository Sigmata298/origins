/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej5.limite;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Guia2Ej5Limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        Scanner leer = new Scanner(System.in);

        int num, num2;
        int suma=0;
        System.out.println("Ingrese un valor límite");
        num = leer.nextInt();

        do {
            System.out.println("Ingrese los valores a sumar");
            num2 = leer.nextInt();
            suma = suma + num2;

        } while ( suma <= num); 
        
               System.out.println("El valor sumado es: "+suma);
    
    }
    
}
