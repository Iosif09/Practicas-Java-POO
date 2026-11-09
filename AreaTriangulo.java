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

public class AreaTriangulo {
    
    public double Triangulo() {
        
        double base, area, altura;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca Base: ");
        base = teclado.nextDouble();
        
        System.out.print("Introduzca Altura: ");
        altura = teclado.nextDouble();
        
        area = (base * altura) / 2;
        
        return area;
    }
}
