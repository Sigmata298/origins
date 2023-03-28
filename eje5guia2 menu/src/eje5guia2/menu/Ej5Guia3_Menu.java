/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5guia3_menu;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Ej5Guia3_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta
que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. */
    
Scanner leer = new Scanner (System.in);

int num1;
int num2;
int suma,resta,mult,div;
int menu=0;
String conf;

do{
    
System.out.println("Ingrese un numero:");
num1 = leer.nextInt();

System.out.println("Ingrese otro numero:");
num2 = leer.nextInt();

System.out.println("Seleccione la operación a realizar");
System.out.println("--------------");
System.out.println("1- Sumar");
System.out.println("2- Restar");
System.out.println("3- Multiplicar");
System.out.println("4- Dividir");
System.out.println("5- Salir");
System.out.println("--------------");
System.out.println("Elija la opcíon: ");
menu = leer.nextInt();
   
switch (menu)
    
{
    case 1:  {
        suma =0;
    suma = num1 + num2;
    System.out.println("La suma es " +suma);
    
    break;
    }
    case 2: {
        resta =0;
        resta= num1-num2;
    System.out.println("La resta es " +resta);
    
    break;
    }
    
    case 3 :  {
        mult = 0;
        mult = num1 * num2;
        System.out.println("La multiplicación es " +mult);
        
    break;
    }
    
    case 4: {
    div = 0;
    div = num1 / num2;
    System.out.println("La división es " +div);
    
    break;

    }
    
    case 5: {
        
         System.out.println("¿Esta seguro de salir? (s/n) ");
         conf = leer.next();
        if (conf !="s")
        {
       System.out.println("Gracias por usar Calculadoras. Vuelvas prontos ");

            break;
        }
       
    }
}
} while (menu!=5);

}
}