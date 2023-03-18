/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;
import java.util.Scanner;
public class EJERCICIO12 {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner horas_trabajadas = new Scanner(System.in);
        Scanner valor_horatrabajo = new Scanner(System.in);
        
        Trabajador resultado = new Trabajador ();
        
        System.out.println("Por favor ingrese el nombre del trabajador");
        resultado.N_trabajador =nombre.next();
        
        System.out.println("Por favor ingrese las horas trabajadas");
        resultado.H_trabajadas =horas_trabajadas.nextInt();
        
        System.out.println("Por favor ingrese el valor de las horas trabajadas");
        resultado.V_horatrabajo =valor_horatrabajo.nextDouble();
        
        resultado.nombre(resultado.N_trabajador);
        resultado.salario(resultado.H_trabajadas, resultado.V_horatrabajo);
              
    }
}
