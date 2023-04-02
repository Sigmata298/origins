/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5guia3_obra_social;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej5Guia3_Obra_Social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.*/

        Scanner sc = new Scanner(System.in);
        char cobertura;
        double trat = 0, valor = 0;

        System.out.println("Ingrese su plan de cobertura ( A, B o C ):");
        cobertura = sc.next().charAt(0);

        System.out.println("Ingrese el monto del tratamiento a realizar: ");
        trat = sc.nextFloat();

        switch (cobertura) {
            case 'a':
                valor = trat * 0.5;
                System.out.println("El tratamiento tendra un costo de $" + valor);
                break;
            case 'b':
                valor = trat * 0.65;
                System.out.println("El tratamiento tendra un costo de $" + valor);
                break;
            case 'c':
                System.out.println("Su plan de cobertura no posee descuentos sobre el tratamiento a realizar");
                break;

            default:
                System.out.println("Ingrese un plan de cobertura válido");
                System.out.println("A - B - C");
    }
    
}
}