/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1;
     int num2;
     int suma;
     
     Scanner scan = new Scanner (System.in);
     
     System.out.println("Ingrese el numero a sumar: ");
     num1 = scan.nextInt();
     
     System.out.println("Ingrese el segundo numero ");
     num2= scan.nextInt();
       
     suma= num1 + num2;
     
          System.out.println("La suma de los numeros es: " + suma);

     
    }
    
}
