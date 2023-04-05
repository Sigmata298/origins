/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6guia4.cuadrado_magico;

/**
 *
 * @author pablo
 */
public class Ej6Guia4Cuadrado_Magico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y 
        determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.*/

        int matriz[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int i, j, num;
        int fila1 =0, fila2, fila3, col1, col2, col3, diag1, diag2;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        // Validacion de sumas
        /*       fila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        fila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        fila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        col1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        col2 = matriz[0][1] + matriz[1][2] + matriz[2][3];
        col3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        
        
        System.out.println(fila1+ "fila1");
        System.out.println(fila2 + "fila2");
        System.out.println(fila3);
        System.out.println(col1);
        System.out.println(col2);
        System.out.println(col3);   */
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; i++) {
                fila1 = matriz[0][0] + matriz[0][2];
       
            }
                    System.out.println(fila1);
        }
         

    } //<--

}
