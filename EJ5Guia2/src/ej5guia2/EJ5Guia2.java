/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5guia2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EJ5Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numLim;
        int num;
        int suma;
        suma=0;
        
        Scanner leer=new Scanner (System.in);
    
        System.out.println("Ingrese un valor limite:");
        numLim= leer.nextInt();
        
        do
        {
            System.out.println("Ingrese un numero positivo");
            num= leer.nextInt();
            
            suma = suma + num;
        } while (numLim >= suma);
            
    }
    
}
