/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcialpoo;

/**
 *
 * @author jose
 */

import java.util.Scanner;

public class Promedio5Materias {
    
    public static void main (String[] args){
        
        double promedio, suma = 0;
        int [] array = new int[5];
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa tus Calificaciones (5 Materias) \n ");
        
        for (int i = 0; i < array.length; i++){
            
            System.out.print("Ingrese Materia numero " + i + ": ");
            array[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < array.length; i++){
            
            suma = suma + array[i];
        }
        
        promedio = suma / array.length;
        
        System.out.println("La Suma es de : " + suma);
        System.out.println("Su Promedio es de: " + promedio);
    }
}