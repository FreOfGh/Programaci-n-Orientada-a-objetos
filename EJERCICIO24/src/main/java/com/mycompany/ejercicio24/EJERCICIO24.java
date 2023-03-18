/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class EJERCICIO24 {

    public static void main(String[] args) {
        Scanner esfeA = new Scanner(System.in);
        Scanner esfeB = new Scanner(System.in);
        Scanner esfeC = new Scanner(System.in);
        
        Esferas resultado = new Esferas();
        
        System.out.println("Por favor ingrese la esfera A");
        resultado.esferaA = esfeA.nextDouble();
        
        System.out.println("Por favor ingrese la esfera B");
        resultado.esferaB = esfeB.nextDouble();
        
        System.out.println("Por favor ingrese la esfera C");
        resultado.esferaC = esfeC.nextDouble();
        
        resultado.comparar(resultado.esferaA, resultado.esferaB, resultado.esferaC);
        
    }
}
