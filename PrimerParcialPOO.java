/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerparcialpoo;

/**
 *
 * @author jose
 */

import java.util.Scanner;

public class PrimerParcialPOO {

    public static void main(String[] args){
        
        int opcion;
        double resultado;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Menu \n 0 -> Area Triangulo \n 1 -> Area Circulo \n 2 -> Area Cuadrado \n 3 -> Area Trapecio \n 4 -> Densidad \n 5 -> Masa \n 6 -> Volumen \n 7 -> Distancia 2 Puntos \n 8 -> Formula General \n");
        System.out.print("Seleccione una Opcion: ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
        
            case 0 -> {
                AreaTriangulo miTriangulo = new AreaTriangulo();
                resultado = miTriangulo.Triangulo();
                System.out.println("Area: " + resultado);
            }
            
            case 1 -> {
                AreaCirculo miCirculo = new AreaCirculo();
                resultado = miCirculo.Circulo();
                System.out.println("Area: " + resultado);
            }
            
            case 2 -> {
                AreaCuadrado miCuadrado = new AreaCuadrado();
                resultado = miCuadrado.Cuadrado();
                System.out.println("Area: " +resultado);
            }
            
            case 3 -> {
                Ejercicio2 miTrapecio = new Ejercicio2();
                resultado = miTrapecio.Trapecio();
                System.out.println("Area: " + resultado);
            }
                
            case 4 -> {
                CalculoDensidad densidad = new CalculoDensidad();
                resultado = densidad.Densidad();
                System.out.println("Densidad: " + resultado);
            }
            
            case 5 -> {
                CalculoMasa masa = new CalculoMasa();
                resultado = masa.Masa();
                System.out.println("Masa: " + resultado);
            }
            
            case 6 -> {
                CalculoVolumen volumen = new CalculoVolumen();
                resultado = volumen.Volumen();
                System.out.println("Volumen: " + resultado);
            }
            
            case 7 -> {
                Distancia2Puntos distancia = new Distancia2Puntos();
                resultado = distancia.Distancia2Puntos();
                System.out.println("Distancia de: " + resultado);
            }
            
            case 8 -> {
                FormulaGeneral fg = new FormulaGeneral();
                double[] resultadofg = fg.FormulaG();
                
                System.out.println("Resultado X1: " + resultadofg[0] + "\n Resultado X2: " + resultadofg[1]);
            }
            
            default -> System.out.print("No valido");
        
        }
    }
}
