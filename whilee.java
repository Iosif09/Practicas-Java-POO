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

public class whilee {
        
    Scanner teclado = new Scanner (System.in);
    int opcion;
        
        public void whilejemplo(){
            
            System.out.print("While Ejemplo \n");
            
            int i=1;
            while (i<=5)
            {
                System.out.println(i);
                i++;
            }
        }
        
        public void DO_While(){
            
            System.out.print("Do-While Ejemplo \n");
            do {
                System.out.println("1 -> Suma");
                System.out.println("2 -> Resta");
                System.out.println("0 -> Salir");
                System.out.println("Elija una Opcion");
                
                opcion = teclado.nextInt();
            } while (opcion !=0);
    }
}
