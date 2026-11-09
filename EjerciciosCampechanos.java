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
import java.util.regex.Pattern;

public class EjerciciosCampechanos {
    
    Scanner teclado = new Scanner (System.in);
    
    public int ejercicio1() {
        
        int num1, num2, prod;
        
        System.out.println("\n Multiplicacion sin 0 \n");
        System.out.print("Ingresa un Numero a Multiplicar: ");
        num1 = teclado.nextInt();
        
        if (num1 == 0){
            
            System.out.println("El producto de 0 por cualquier numero es 0");
            
        } else {   
            
            System.out.println("Ingresa un Segundo Numero: ");
            num2 = teclado.nextInt();
        
            prod = num1 * num2;
            
            System.out.println("Resultado del producto " + num1 + " * " + num2 + " = " + prod);
        }
        
        return 0;
    }
    
    public int ejercicio2() {
        
        double numer, denom, r;
        
        System.out.println("\n Division sin 0 \n");
        System.out.print("Ingresa el Numerador: \n");
        numer = teclado.nextDouble();
        
        System.out.print("Ingresa el Denominador: \n");
        denom = teclado.nextDouble();
        
        if (denom != 0){
            
            r = numer / denom;
            
            System.out.println("Resultado de la division " + numer + " / " + denom + " = " + r);
            
        } else {
            
            System.out.println("Error: No se puede dividir entre cero");
        }
        
        return 0;
    }
    
    public int ejercicio3() {
        
        int num;
        
        System.out.println("\n Numero Par?\n");
        System.out.println("Ingresa un Numero Entero: ");
        num = teclado.nextInt();
        
        if (num % 2 == 0){
                
            System.out.println("Tu numero " + num + " es PAR");
            
        } else {
            
            System.out.println("Tu numero " + num + " es IMPAR");
        }
        
        return 0;
    }
    
    public int ejercicio4() {
        
        int num1, num2;
        
        System.out.println("\n Mayor o Menor \n");
        System.out.println("Ingresa un Primer Numero Entero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrea un Segundo Numero Entero: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2){
            
            System.out.println("Tu numero " + num1 + " es Mayor que " + num2);
            
        } else {
            
            System.out.println("Tu Numero " + num2 + " es Mayor que " + num1);
        }
        
        return 0;
    }
    
    public int ejercicio5() {
        
        int num1, num2;
        
        System.out.println("\n Multiplos \n");
        System.out.println("Ingresa un Primer Numero Entero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingresa un Segundo Numero Entero: ");
        num2 = teclado.nextInt();
        
        if (num1 % num2 == 0) {
            
            System.out.println("Tu numero " + num1 + " SI es multiplo de " + num2);
            
        } else {
            
            System.out.println("Tu Numero " + num1 + " NO es multiplo de " + num2);
        }
        
        return 0;
    }
    
    public int ejercicio6() {
        
        char letra;
        
        System.out.println("\n Vocal? \n");
        System.out.println("Ingresa una Letra: ");
        letra = teclado.nextLine().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            
            System.out.println("Tu letra " + letra + " es una VOCAL");
        } else {
            
            System.out.println("Tu letra " + letra + " es una CONSONANTE");
        }
        
        return 0;
    }
    
    public int ejercicio7(){
        
        int num1, num2;
        
        System.out.println("\n Positivos \n");
        System.out.println("Ingresa un Primer Numero Positivo o Negativo: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingresa un Segundo Numero Positivo o Negativo: ");
        num2 = teclado.nextInt();
        
        if (num1 > 0) {
            
            if (num2 > 0) {
                
                System.out.println("Los Numeros " + num1 + " y " + num2 + " son POSITIVOS");
            } else {
                
                System.out.println("Numero Positivo " + num1 + " numero Negativo " + num2);
            }
        } else {
            
            if (num2 > 0) {
                
                System.out.println("Numero Positivo " + num2 + " Numero Negativo " + num1);
            } else {
                
                System.out.println("Los Numeros " + num1 + " y " + num2 + " son NEGATIVOS");
            }
        }
        
        return 0;
    }
    
    public int ejercicio8() {
        
        int num1, num2, num3;
        
        System.out.println("\n 3 Numeros Mayor \n");
        System.out.println("Ingrese un Primer Numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese un Segundo Numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese un Tercer Numero: ");
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            
            System.out.println("Numero " + num1 + " Mayor que " + num2 + " y " + num3);
        }
        
        if (num2 > num1 && num2 > num3) {
            
            System.out.println("Numero " + num2 + " Mayor que " + num1 + " y " + num3);
        }
        
        if (num3 > num1 && num3 > num2) {
            
            System.out.println("Numero " + num3 + " Mayor que " + num1 + " y " + num2);
        }
        
        return 0;
    }
    
    public int ejercicio9() {
        
        short num1, num2;
        
        System.out.println("\n Enteros Cortos \n");
        System.out.println("Ingresa un Primer Numero Entero: ");
        num1 = teclado.nextShort();
        
        System.out.println("Ingresa un Segundo Numero Entero: ");
        num2 = teclado.nextShort();
        
        if (num1 == num2) {
            
            System.out.println("Los Numeros Enteros " + num1 + " y " + num2 + " son IGUALES");
            
        } else {
            
            if (num1 > num2) {
                
                System.out.println("Numero " + num1 + " es Mayor que " + num2);
            } else {
                
                System.out.println("Numero " + num1 + " es Menor que " + num2);
            }
        }
        
        return 0;
    }
    
    public int ejercicio10() {
        
        String nombre;
        
        System.out.println("\n Saludo \n");
        System.out.println("Ingresa tu Nombre: ");
        nombre = teclado.next();
        
        if (nombre.equals("Juan")) {
            
            System.out.println("Hola " + nombre);
        } else {
            
            System.out.println("No te conozco...");
        }
        
        return 0;
    }
    
    public int ejercicio11() {
        
        double p, l, a, b, c;
        int opcion;
        
        System.out.println("\n Menu Triangulos \n");
        System.out.println("1 -> Equilatero");
        System.out.println("2 -> Isoseles");
        System.out.println("3 -> Escaleno");
        System.out.println("\nSeleccione una Opcion: ");
        opcion = teclado.nextInt();
        
        switch (opcion)
        {
            case 1 -> {
            
                System.out.println("\n Equolatero");
                System.out.println("Ingrese Medida de un Lado: ");
                l = teclado.nextDouble();
                
                System.out.println("Perimetro de: " + (p = l*3));
            }
            
            case 2 -> {
                
                System.out.println("\n Isoseles");
                System.out.println("Ingrese Medida de Lados Iguales: ");
                a = teclado.nextDouble();
                
                System.out.println("Ingrese Medida de Lado Desigual: ");
                b = teclado.nextDouble();
                
                System.out.println("Perimetro de: " + (p = (2*a)+b));
            }
            
            case 3 -> {
                
                System.out.println("\n Escaleno");
                System.out.println("Ingrese Medida de Lado A: ");
                a = teclado.nextDouble();
                
                System.out.println("Ingrese Medida de Lado B: ");
                b = teclado.nextDouble();
                
                System.out.println("Ingrese Medida de Lado C: ");
                c = teclado.nextDouble();
                
                System.out.println("Perimetro de: " + (p = a + b + c));
            }
        }
        
        return 0;
    }
    
    public int ejercicio12() {
        
        int num, numn;
        
        System.out.println("\n Condicional \n");
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        
        if (num > 0) {
            
            System.out.println("Numero Positivo: " + num);
        } else {
            
            System.out.println("Numero Negativo: " + num + "\nCambiado a Positivo: " + (numn = num * (-1)));
        }
        
        return 0;
    }
    
    public int ejercicio13() {
        
        int num1, num2;
        
        System.out.println("\n Numero Menor \n");
        System.out.println("Ingrese el Primer Numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el Segundo Numero ");
        num2 = teclado.nextInt();
        
        if (num1 < num2) {
            
            System.out.println("Su Numero " + num1 + " es menor a " + num2);
        } else {
            
            System.out.println("Su Numero " + num2 + " es menor a " + num1);
        }
        
        return 0;
    }
    
    public int ejercicio14() {
        
        System.out.println("\n Texto \n");
        System.out.println("Ingrese un Caracter en Consola: ");
        
        if (teclado.hasNextInt()) {
            
            int num = teclado.nextInt();
            
            System.out.println("Texto introducido es una Cifra Numerica");
            
        } else {
            
            char texto = teclado.next().charAt(0);
            
            if (texto == 'a' || texto == 'e' || texto == 'i' || texto == 'o' || texto == 'u') {
                
                System.out.println("Texto introducido es una VOCAL");
            } else {
                
                System.out.println("Texto introducido es una CONSONANTE");
            }
            
        }
        
        return 0;
    }
    
    public int ejercicio15() {
        
        System.out.println("\n Signos de Punutuacion \n");
        System.out.println("Ingrese un caracter: ");
        
        if (teclado.hasNextInt()) {
            
            int num = teclado.nextInt();
            
            System.out.println("Ingresaste un Numero: " + num);
            
        } else if (teclado.hasNext()) {
            
            String texto = teclado.next();
            boolean puntuacion = texto.matches(".*\\p{Punct}.*");
            
            if (puntuacion == true) {
                
                System.out.println("Ingresaste un Signo de Puntuacion: " + texto);
                
            } else {
                
                char textoc = texto.charAt(0);
                
                if (textoc == 'a' || textoc == 'e' || textoc == 'i' || textoc == 'o' || textoc == 'u') {
                    
                    System.out.println("Ingresaste una Vocal: " + textoc);
                } else {
                    
                    System.out.println("Ingresaste una Letra: " + textoc);
                }
            }
        }
        
        return 0;
    }
    
    public int ejercicio16() {
        
        String contra;
        
        System.out.println("\n Contraseña \n");
        
        for (int i = 1; i > 0; i++) {
            
            System.out.println("Ingrese la contraseña: ");
            contra = teclado.next();
            
            if (contra.equals("clave")) {
                
                System.out.println("Contraseña Correcta!");
                i = -1;
                
            } else {
                
                System.out.println("Intente otra vez\n");
            }
        }
        
        return 0;
    }
    
    public int ejercicio17() {
        
        System.out.println("\n 10 While \n");
        System.out.println("Listado del 1 a 10: ");
        
        int i = 1;
        while (i<=10) {
            
            System.out.println(i);
            i++;
        }
        
        return 0;
    }
    
    public int ejercicio18() {
        
        System.out.println("\n Pares Descendientes \n");
        System.out.println("Pares de 26 a 10: ");
        
        int i = 26;
        
        while (i >= 10) {
            
            System.out.println(i);
            i-=2;
        }
        
        return 0;
    }
    
    public int ejercicio19() {
        
        int num, cifras=0, Num=0;
        
        System.out.println("\n Numero Cifras \n");
        System.out.println("Ingrese Numeros Enteros: ");
        num = teclado.nextInt();
        
        Num = num;
        
        for (int cifra = 1; num > 0; cifra++) {
            
            num = num / 10;
            cifras = cifra;
        }
        
        System.out.println("Numero: "+ Num + " Cifras: " + cifras);
        
        return 0;
    }
    
    public int ejercicio20() {
        
        int num;
        String [] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("\n Calendario \n");
        System.out.println("Ingrese un Numero del 1 al 12: ");
        num = teclado.nextInt();
        
        if (num < 1 || num >12) {
            
            System.out.println("Numero Incorrecto");
        } else {
            
            num = num-1;
        
            System.out.println("Numero Mes: " + (num +1) + " Mes: " + Meses[num]);
        }
        
        return 0;
    }
    
    public int ejercicio21() {
        
        int num, res=0;
        
        System.out.println("\n Suma Infinita \n");
        System.out.println("Ingrese Numeros Positivos, para terminar, ingrese Numeros Negativos \n");
        
        for (int i = 1; i > 0; i++) {
            
            System.out.println("Ingrese Numero: ");
            num = teclado.nextInt();
            
            if (num < 0) {
                
                System.out.println("Suma Total: " + res);
                i = num;
                
            } else {
                
                res = num + res;
            }       
        }
        return 0;
    }
    
    public int ejercicio22() {
        
        int i=0, Num [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        
        System.out.println("\n Listado con Do-While \n");
        System.out.println("Numeros del 1 al 10: ");
        
        do {
            
            System.out.println(Num[i]);
            i++;
            
        } while (Num[i] != 11);
        
        return 0;
    }
    
    public int ejercicio23() {
        
        int num = 26;
        
        System.out.println("\n Pares Desendientes 2 \n");
        System.out.println("Imprimiendo del 26 al 10: ");
        
        do {
            
            System.out.println(num);
            num -=2;
            
        } while (num >=10);
        
        return 0;
    }
    
    public int ejercicio24() {
        
        String nombre, contraseña;
        
        System.out.println("\n Nombre y Contraseña \n");
        
        for (int i = 1; i > 0; i++) {
            
            System.out.println("Ingrese Nombre: ");
            nombre = teclado.next();
            
            System.out.println("Ingrese Contraseña: ");
            contraseña = teclado.next();
            
            if (nombre.equals("Pedro") && contraseña.equals("Peter")) {
                
                i = -1;
                System.out.println("Nombre y Contraseña Correctos");
                
            } else {
                
                System.out.println("Intentelo de Nuevo");
            }
        }
        
        return 0;
    }
    
    public int ejercicio25() {
        
        int num = 15;
        
        System.out.println("\n Dessucesion \n");
        System.out.println("Imprimiendo Numeros del 15 al 5: ");
        
        do {
            
            System.out.println(num);
            num --;
            
        } while (num >= 5);
        
        return 0;
    }
    
    public int ejercicio26() {
        
        int num = 0;
        
        System.out.println("\n 8 Pares \n");
        System.out.println("Imprimiendo primero 8 Numeros Pares");
        
        do {
            
            System.out.println(num);
            num +=2;
            
        } while (num <=8);
        
        return 0;
    }
    
    public int ejercicio27() {
        
        String Semana [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int num;
        
        System.out.println("\n Dias de Semana \n");
        System.out.println("Ingrese un Numero de la Semana: ");
        num = teclado.nextInt();
        
        if (num > 7 || num < 1) {
            
            System.out.println("Numero Invalido");
            
        } else {
            
            num = num - 1;
            System.out.println("Numero Ingresado: " + (num+1) + " Dia: " + Semana[num]);
        }
        
        return 0;
    }
}