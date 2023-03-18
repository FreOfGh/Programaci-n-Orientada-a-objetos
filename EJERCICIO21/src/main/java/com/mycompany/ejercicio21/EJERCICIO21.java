

package com.mycompany.ejercicio21;
import java.util.Scanner;
public class EJERCICIO21 {

    public static void main(String[] args) {
        Scanner lado1 = new Scanner(System.in);
        Scanner lado2 = new Scanner(System.in);
        Scanner lado3 = new Scanner(System.in);
        
        Lados operaciones = new Lados ();
        
        System.out.println("Por favor ingrese el lado 1");
        operaciones.L1 = lado1.nextDouble();
        
        System.out.println("Por favor ingrese el lado 2");
        operaciones.L2 = lado2.nextDouble();
        
        System.out.println("Por favor ingrese el lado 3");
        operaciones.L3 = lado3.nextDouble();
        
        // ACCIONES
        
        operaciones.perimetro(operaciones.L1, operaciones.L2, operaciones.L3);
        operaciones.semiperimetro(operaciones.L1, operaciones.L2, operaciones.L3);
        operaciones.area(operaciones.L1, operaciones.L2, operaciones.L3);
    }
}
