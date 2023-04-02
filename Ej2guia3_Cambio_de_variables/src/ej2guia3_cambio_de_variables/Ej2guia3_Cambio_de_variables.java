/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia3_cambio_de_variables;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej2guia3_Cambio_de_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que:
B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.*/

        int a = 1, b = 2, c = 3, d = 4, aux = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Valores asignados: ");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        System.out.println();

        System.out.println("Valores intercambiados");

        aux = c;
        b = c;
        b = aux;
        System.out.println("Valor de b: " + b);

        aux = a;
        c = a;
        c = aux;
        System.out.println("Valor de c: " + c);

        aux = d;
        a = d;
        a = aux;
        System.out.println("Valor de a: " + a);

        b=2;
        aux = b;
        d = b;
        d = aux;
        System.out.println("Valor de d: " + d);
    }
    
}
