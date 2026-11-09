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

public class FormulaGeneral {
    
    public double[] FormulaG (){
        
        double a, b, c, x1, x2;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa A: ");
        a = teclado.nextDouble();
        
        System.out.print("Ingresa B: ");
        b = teclado.nextDouble();
        
        System.out.print("Ingresa C: ");
        c = teclado.nextDouble();
        
        x1 = (- b - (Math.sqrt(Math.pow(b, 2) - (4*a*c)))) / (2*a);
        
        x2 = (- b + (Math.sqrt(Math.pow(b, 2) - (4*a*c)))) / (2*a);
        
        return new double[] {x1, x2} ;
    }
}
