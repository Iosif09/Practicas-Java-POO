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

public class MenuCampechano {
    
    public static void main (String[] args) {
        
        EjerciciosCampechanos ejercam = new EjerciciosCampechanos();
        Scanner teclado = new Scanner (System.in);
        
        int opcion;
        
        System.out.println(" - Menu Campechano - \n");
        System.out.println("1 -> Multiplicacion");
        System.out.println("2 -> Division");
        System.out.println("3 -> Numero Par y Residuo");
        System.out.println("4 -> Numero Mayor");
        System.out.println("5 -> Multiplos");
        System.out.println("6 -> Vocal");
        System.out.println("7 -> Positivo");
        System.out.println("8 -> Mayores que");
        System.out.println("9 -> Enteros Cortos");
        System.out.println("10 -> Juan?");
        System.out.println("11 -> Triangulos");
        System.out.println("12 -> Condicional en un Numero");
        System.out.println("13 -> Menor de 2 Numeros");
        System.out.println("14 -> Tipo de Dato Introducido");
        System.out.println("15 -> Signos de Puntuacion?");
        System.out.println("16 -> Contraseñas");
        System.out.println("17 -> While");
        System.out.println("18 -> Decremento en Pares");
        System.out.println("19 -> Cifras");
        System.out.println("20 -> Meses del Año");
        System.out.println("21 -> Suma Positiva");
        System.out.println("22 -> Do-While");
        System.out.println("23 -> Decremento en Pares 2");
        System.out.println("24 -> Usuario Correcto");
        System.out.println("25 -> Desusecion 15 a 5");
        System.out.println("26 -> Pares a 8");
        System.out.println("27 -> Dias de la Semana");
        System.out.print("\nSelecciona una Opcion: ");
        opcion = teclado.nextInt();
        
        if (opcion > 27 || opcion < 1) {
            
            System.out.println("Opcion Invalida");
        } else { 
        
            switch (opcion)
            {
                case 1 -> {
                
                    ejercam.ejercicio1();
                }
            
                case 2 -> {
                
                    ejercam.ejercicio2();
                }
            
                case 3 -> {
                
                    ejercam.ejercicio3();
                }
            
                case 4 -> {
                
                    ejercam.ejercicio4();
                }
            
                case 5 -> {
                
                    ejercam.ejercicio5();
                }
            
                case 6 -> {
                
                    ejercam.ejercicio6();
                }
            
                case 7 -> {
                
                    ejercam.ejercicio7();
                }
            
                case 8 -> {
                
                    ejercam.ejercicio8();
                }
            
                case 9 -> {
                
                    ejercam.ejercicio9();
                }
            
                case 10 -> {
                
                    ejercam.ejercicio10();
                }
            
                case 11 -> {
                
                    ejercam.ejercicio11();
                }
            
                case 12 -> {
                
                    ejercam.ejercicio12();
                }
            
                case 13 -> {
                
                    ejercam.ejercicio13();
                }
            
                case 14 -> {
                
                    ejercam.ejercicio14();
                }
            
                case 15 -> {
                
                    ejercam.ejercicio15();
                }
            
                case 16 -> {
                
                    ejercam.ejercicio16();
                }
            
                case 17 -> {
                
                    ejercam.ejercicio17();
                }
            
                case 18 -> {
                
                    ejercam.ejercicio18();
                }
            
                case 19 -> {
                
                    ejercam.ejercicio19();
                }
            
                case 20 -> {
                    ejercam.ejercicio20();
                }
            
                case 21 -> {
                
                    ejercam.ejercicio21();
                }
            
                case 22 -> {
                
                    ejercam.ejercicio22();
                }
            
                case 23 -> {
                
                    ejercam.ejercicio23();
                }   
            
                case 24 -> {
                
                    ejercam.ejercicio24();
                }
            
                case 25 -> {
                
                    ejercam.ejercicio25();
                }
            
                case 26 -> {
                
                    ejercam.ejercicio26();
                }   
            
                case 27 -> {
                
                    ejercam.ejercicio27();
                }
            }
        }
    }
}
