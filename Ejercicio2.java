package com.mycompany.primerparcialpoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose
 */

import java.util.Scanner;

public class Ejercicio2 {
    
    public double Trapecio(){
        
        double baseM, basem, altura, area;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa base Mayor: ");
        baseM = teclado.nextDouble();
        
        System.out.print("Ingresa base Menor: ");
        basem = teclado.nextDouble();
        
        System.out.print("Ingresa altura: ");
        altura = teclado.nextDouble();
        
        area = ((baseM + basem) * altura) / 2;
        
        return area;
    }
    
}
