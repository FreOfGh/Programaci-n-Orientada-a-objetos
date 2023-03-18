/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;
import java.util.Scanner;
public class EJERCICIO22 {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner salarioxhora = new Scanner(System.in);
        Scanner horastrabajadas = new Scanner(System.in);
        
        Trabajador resultado = new Trabajador ();
        
        System.out.println("Por favor ingrese el nombre del trabajador");
        resultado.Nombre = nombre.next();
        
        System.out.println("Por favor ingrese el salario básico por hora");
        resultado.S_hora = salarioxhora.nextDouble();
        
        System.out.println("Por favor ingrese el numero de horas trabajadas al mes");
        resultado.N_horas_trabajadas = horastrabajadas.nextInt();
        
        resultado.SalarioMensual(resultado.Nombre, resultado.S_hora, resultado.N_horas_trabajadas);   
    }
}
