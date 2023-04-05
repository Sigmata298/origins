/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia4.extras.relleno_del_vector_con_funcion;



/**
 *
 * @author pablo
 */
public class Ej3Guia4ExtrasRelleno_del_vector_Con_funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector. /*
        
        
         */

        int vec[] = new int[5];

        rellenarVector(vec);
        imprimirVector(vec);
    }

    public static void rellenarVector(int vec[]) {

        int i;
        
        for ( i = 0; i < vec.length; i++) {
                
                vec[i]= (int)(Math.random()*10);
            }     

    }
    
    public static void imprimirVector(int vecto[]) {
        
        for (int i =0;i<vecto.length;i++)
            
            System.out.print("[" + vecto[i] + "]");
        
        System.out.println();
           
    }
}
