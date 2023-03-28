/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1gua2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej1Gua2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*1.	Crear un programa que dado un número determine si es par o impar.*/
        
        int num;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        num=leer.nextInt();
        
        if (num %2 ==0)
        {
            System.out.println("El numero es  par");
            
        }
        
        else {
            System.out.println("El numero es impar");
            
            
        }
        
        
    }
    
}
