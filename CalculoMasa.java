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

public class CalculoMasa {
    
    public double Masa (){
        
        double v, d, m;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingrese densidad: ");
        d = teclado.nextDouble();
        
        System.out.print("Ingrese volumen: ");
        v = teclado.nextDouble();
        
        m = d * v;
        
        return m;
    }
}
