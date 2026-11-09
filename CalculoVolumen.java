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

public class CalculoVolumen {
    
    public double Volumen(){
     
        double m, v, d;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa Masa: ");
        m = teclado.nextDouble();
        
        System.out.print("Ingresa Densidad: ");
        d = teclado.nextDouble();
        
        v = m / d;
        
        return v;
    }
}
