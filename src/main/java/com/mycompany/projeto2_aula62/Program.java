
package com.mycompany.projeto2_aula62;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
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
        
        double areaX = x.area();
        double areaY = y.area();
        
        if(areaX > areaY){
            System.out.printf("Area do triangulo X = %.2f maior que area de Y %.2f ", areaX, areaY);
        } else {
            System.out.printf("Area do triangulo Y = %.2f maior que area de X %.2f", areaY, areaX);
        }
        input.close();
    }
}