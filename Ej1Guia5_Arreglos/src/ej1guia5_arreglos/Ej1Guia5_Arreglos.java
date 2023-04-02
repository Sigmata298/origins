/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia5_arreglos;

/**
 *
 * @author pablo
 */
public class Ej1Guia5_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.*/

        int vector[] = new int[100];
        int i;


    
      
      for (i=100;i<0;i++)
      {
           vector[i] = i ;

        }

       for ( i = vector.length - 1; i >= 0; i--){
            
            System.out.println(vector[i] + " ");

        }

    }

}
