/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import java.util.Scanner;
public class EJERCICIO19 {

    public static void main(String[] args) {
        Scanner lado = new Scanner(System.in);
        
        Triangulo Trianequi = new Triangulo ();
        
        System.out.println("Por favor ingrese el lado del triangulo");
        Trianequi.Lado = lado.nextDouble ();
        
        //ACCIONES
        
        Trianequi.perimetro(Trianequi.Lado);
        Trianequi.altura(Trianequi.Lado);
        Trianequi.area(Trianequi.Lado);
        
        
        
    }
}
