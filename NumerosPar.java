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

public class NumerosPar {
    
    public static void main (String[] args){
        
        int num;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa un Numero: ");
        num = teclado.nextInt();
        
        if (num % 2 == 0){
            
            System.out.print("Su numero es PAR");
        } else {
            
            System.out.print("Su numero es IMPAR");
        }
    }
    
}
