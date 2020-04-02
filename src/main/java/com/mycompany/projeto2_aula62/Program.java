
package com.mycompany.projeto2_aula62;
import com.mycompany.projeto2_aula62.Triangulo;
import java.util.Locale;

/* 
 * Fazer um programa para ler as medidas dos lados de
 * dois triangulos X e Y (suponha medidas válidas).
 * Em seguida, mostrar o valor das áreas dos dois triângulos
 * e dizer qual dos dois triângulos possui a maior área.
 * area = raiz p * (p-a) * (p-b) * (p-c)
 * p = (a+b+c)/2
 */

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 * Solucao 1, paradigma estruturado
 */

public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        double areaX, areaY;
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        
        System.out.println("LADOS DO TRIANGULO X");
        System.out.print("Informe o lado 1: ");
        x.a = input.nextDouble();
        System.out.print("Informe o lado 2: ");
        x.b = input.nextDouble();
        System.out.print("Informe o lado 3: ");
        x.c = input.nextDouble();
        
        System.out.println("LADOS DO TRIANGULO Y");
        System.out.print("Informe o lado 1: ");
        y.a = input.nextDouble();
        System.out.print("Informe o lado 2: ");
        y.b = input.nextDouble();
        System.out.print("Informe o lado 3: ");
        y.c = input.nextDouble();
        
        double pX = (x.a + x.b + x.c)/2.0;
        areaX = Math.sqrt(pX * (pX-x.a) * (pX-x.b) * (pX-x.c));
        
        double pY = (y.a + y.b + y.c)/2.0;
        areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
        
        if(areaX > areaY){
            System.out.printf("Area do triangulo X = %.2f maior que area de Y %.2f ", areaX, areaY);
        } else {
            System.out.printf("Area do triangulo Y = %.2f maior que area de X %.2f", areaY, areaX);
        }
        input.close();
    }
}