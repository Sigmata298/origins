/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package ej5guia4matriz_antisimetrica;

/**
 *
 * @author pablo
 */
public class Ej5Guia4Matriz_antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 */

        //defino
        //int[][] matrizA = new int[3][3];
       //int[][] matrizB = new int[3][3];
        
        int matrizA[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};      
         int matrizB[][] = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};
        
        int cont = 0;

//lleno matrizA
        //for (int i = 0; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
        //        matrizA[i][j] = (int) (Math.random() * 10 + 1);
        //    }
       // }
//lleno matrizB es la traspuesta de A
      //  for (int i = 0; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
       //         matrizB[i][j] = (matrizA[j][i]) * -1; //(matrizA[i][j]) * -1
       //     }
      //  }
        
//la muestro A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("-----------------------------------");

//la muestro B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("-----------------------------------");

//es matrix igual pero en negativo?
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == ((matrizB[i][j]) * -1)) {
                    cont = cont + 1;
                }
            }
        }
        System.out.println("el contador de igualdades es : " + cont);

// RESULTADO:   
        if (cont == 9) {
            System.out.println("la matriz es antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }

    }//FINB

}