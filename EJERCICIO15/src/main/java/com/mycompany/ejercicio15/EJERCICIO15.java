/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;
import java.util.Scanner;
public class EJERCICIO15 {

    public static void main(String[] args) {
        Scanner esfe1 = new Scanner(System.in);
        Scanner esfe2 = new Scanner(System.in);
        Scanner esfe3 = new Scanner(System.in);
        Scanner esfe4 = new Scanner(System.in);
        
        Esferas resultado = new Esferas();
        
        System.out.println("Por favor ingrese la esfera A");
        resultado.esferaA = esfe1.nextDouble();
        
        System.out.println("Por favor ingrese la esfera B");
        resultado.esferaB = esfe2.nextDouble();
        
        System.out.println("Por favor ingrese la esfera C");
        resultado.esferaC = esfe3.nextDouble();
        
        System.out.println("Por favor ingrese la esfera D");
        resultado.esferaD = esfe4.nextDouble();
        
        resultado.comparar(resultado.esferaA, resultado.esferaB, resultado.esferaC, resultado.esferaD);
    }
}
