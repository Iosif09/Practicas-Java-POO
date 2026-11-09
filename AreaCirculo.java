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

public class AreaCirculo {
    
    public double Circulo () {
        
        double area, radio;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa Radio: ");
        radio = teclado.nextDouble();
        
        area = (Math.PI * (radio * radio));
        
        return area;
    }
}
