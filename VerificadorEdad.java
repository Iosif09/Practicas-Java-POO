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

public class VerificadorEdad {
    
    public static void main (String[] args){
        
        int año, edadreal;
        int añoactual = 2026;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa tu AÑO de nacimiento: ");
        año = teclado.nextInt();
        
        edadreal = añoactual - año;
        
        if (edadreal > 18){
           
            System.out.print("Tienes: " + edadreal + " Eres mayor de Edad :)");
        } else {
            
            System.out.print("Tienes: " + edadreal + " Eres menor de Edad!!!");
        }
    }
}
