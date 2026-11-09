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

public class AreaCuadrado {
    
    public double Cuadrado (){
        
        double lado, area;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa valor del Lado: ");
        lado = teclado.nextDouble();
        
        area = Math.pow(lado, 2);
        
        return area;
    }
    
}
