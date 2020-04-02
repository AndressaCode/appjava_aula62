/* UTILIZANDO PARADIGMA ESTRUTURADO
 * Fazer um programa para ler as medidas dos lados de
 * dois triangulos X e Y (suponha medidas válidas).
 * Em seguida, mostrar o valor das áreas dos dois triângulos
 * e dizer qual dos dois triângulos possui a maior área.
 * area = raiz p * (p-a) * (p-b) * (p-c)
 * p = (a+b+c)/2
 */

package com.mycompany.projeto2_aula62;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        double areaX, areaY;
        
        System.out.println("LADOS DO TRIANGULO X");
        System.out.print("Informe o lado 1: ");
        xA = input.nextDouble();
        System.out.print("Informe o lado 2: ");
        xB = input.nextDouble();
        System.out.print("Informe o lado 3: ");
        xC = input.nextDouble();
        
        System.out.println("LADOS DO TRIANGULO Y");
        System.out.print("Informe o lado 1: ");
        yA = input.nextDouble();
        System.out.print("Informe o lado 2: ");
        yB = input.nextDouble();
        System.out.print("Informe o lado 3: ");
        yC = input.nextDouble();
        
        double pX = (xA + xB + xC)/2.0;
        areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
        
        double pY = (yA + yB + yC)/2.0;
        areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
        
        if(areaX > areaY){
            System.out.printf("Area do triangulo X = %.2f maior que area de Y %.2f ", areaX, areaY);
        } else {
            System.out.printf("Area do triangulo Y = %.2f maior que area de X %.2f", areaY, areaX);
        }
        input.close();
    }
}