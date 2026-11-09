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

public class MenuFOR {
    public void menufor (){
        
        int opcion;
        
        FORListado milistado = new FORListado();
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Menu de FOR \n 1 -> Listado \n 2 -> Decremento \n 3 -> Dos en Dos \n 4 -> Promedio Ajustable \n 0 -> Salir \n Selecciona una Opcion: ");
        opcion = teclado.nextInt();
        
        switch (opcion){
            
            case 1 -> {
                
                milistado.Listado();
            }
            
            case 2 -> {
                
                milistado.Decremento();
            }
            
            case 3 -> {
                
                milistado.DosenDos();
            }
            
            case 4 -> {
                milistado.Promedio();
            }
            default -> System.out.print("Opcion Invalida");
        }
    }
}
