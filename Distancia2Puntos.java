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

public class Distancia2Puntos {
    
    public double Distancia2Puntos (){
       
        double x1, x2, y1, y2, d, xpow, ypow;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa X1: ");
        x1 = teclado.nextDouble();
        
        System.out.print("Ingresa X2: ");
        x2 = teclado.nextDouble();
        
        System.out.print("Ingresa Y1: ");
        y1 = teclado.nextDouble();
        
        System.out.print("Ingresa Y2: ");
        y2 = teclado.nextDouble();
        
        xpow = Math.pow(x2 - x1, 2);
        ypow = Math.pow(y2 - y1, 2);
        
        d = Math.sqrt(xpow + ypow) ;
        
        return d;
    }
}