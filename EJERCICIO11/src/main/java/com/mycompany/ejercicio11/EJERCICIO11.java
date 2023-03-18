/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;
import java.util.Scanner;
public class EJERCICIO11 {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        
        Numeros resultado = new Numeros ();
        
        System.out.println("Por favor ingrese el numero 1");
        resultado.N1 =num1.nextDouble();
        
        System.out.println("Por favor ingrese el numero 2");
        resultado.N2 =num2.nextDouble();
        
        System.out.println("Por favor ingrese el numero 3");
        resultado.N3 =num3.nextDouble();
        
        resultado.mayor(resultado.N1, resultado.N2, resultado.N3);
    }
}
