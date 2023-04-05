/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia4.extra.notas_alumnos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej4Guia4ExtraNotas_alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.  */
        String alumnos[] = new String[10];
        int tp1[] = new int[10];
        int tp2[] = new int[10];
        int primerIntegrador[] = new int[10];
        int segundoIntegrador[] = new int[10];
        int promedio[] = new int[4];

        llenarVectores(alumnos, tp1,tp2, primerIntegrador,  segundoIntegrador);

    }

    public static void llenarVectores(String alumnos[], int tp1[], int tp2[], int primerIntegrador[], int segundoIntegrador[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = sc.nextLine();

        }

        for (int i = 0; i < tp1.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + alumnos[i]);
            tp1[i] = sc.nextInt();
        }

        for (int i = 0; i < tp2.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + alumnos[i]);
            tp2[i] = sc.nextInt();
        }

        for (int i = 0; i < primerIntegrador.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + alumnos[i]);
            primerIntegrador[i] = sc.nextInt();
        }

    }

    public static void calcularPromedio(int tp[], int primerIntegrador[], int promedio[]) {

        for (int i = 0; i < promedio.length; i++) {

            promedio[i] = 
        }

    }

}
