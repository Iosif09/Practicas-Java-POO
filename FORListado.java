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

public class FORListado {
    
    Scanner teclado = new Scanner (System.in);
    
    public int Listado(){
        
        System.out.print("\n Listado \n");
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        return 0;
    }
    
    public int Decremento(){
        
        System.out.print("\n Decremento \n");
        
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        return 0;
    }
    
    public int DosenDos(){
        
        System.out.print("\n Dos en Dos \n");
        
        for (int i = 0; i<=10; i+=2){
            System.out.println(i);
        }
        return 0;
    }
    
    public double Promedio(){
        
        int numM;
        double prom, suma = 0, calif;
        
        System.out.print("\n Promedio \n");
        System.out.println("Ingrese el numero de materias a calcular: ");
        numM = teclado.nextInt();
        
        for (int i = 1; i <= numM; i++){
            
            System.out.print("Ingresa la materia No." + i + ": ");
            calif = teclado.nextInt();
            suma = suma + calif;
        }
        
        prom = suma / numM;
        
        if (prom < 6){
            System.out.println("Tu promedio es de: " + prom + "\n Reprobado :c");
        } else {
            System.out.println("Tu promedio es de: " + prom + "\n Aprobaste :D");
        }
        
        return 0;
    }
}
