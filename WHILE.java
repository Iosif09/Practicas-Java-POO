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

public class WHILE {
    
    public void menuwhile (){
        
        int opcion;
        
        whilee listawhile = new whilee();
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Menu de While \n 1 -> While Ejemplo \n 2 -> DO-While \n Selecciona una Opcion: ");
        opcion = teclado.nextInt();
        
        switch (opcion){
            case 1 -> {
                listawhile.whilejemplo();
            }
            
            case 2 ->{
                
                listawhile.DO_While();
            }
        }
    }
}
