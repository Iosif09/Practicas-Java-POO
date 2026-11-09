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

public class Menu_Ciclicos {
    
    public static void main (String[] args){
        
        MenuFOR FOR = new MenuFOR();
        WHILE MWHILE = new WHILE();
        
        int opcion;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Menu Ciclico \n 1 -> Menu FOR \n 2 -> Menu While \n 0 -> Salir \n Selecciona una Opcion: ");
        opcion = teclado.nextInt();
        
        do {
        
        switch (opcion){
            case 1 -> {
                FOR.menufor();
            }
            
            case 2 -> {
                MWHILE.menuwhile();
            }
            
            case 3 -> {
                System.out.println("Salir...");
            }
        }
        
        } while(opcion != 0);
        
    }
}