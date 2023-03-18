/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio22;
public class Trabajador {
    public  String Nombre;
    public double S_hora;
    public int N_horas_trabajadas;
    
    public void Trabjador(){
        Nombre = "";
        S_hora = 0;
        N_horas_trabajadas = 0;
        
    }
    public void SalarioMensual (String nombre, double salariohora, int horatrabajadas){
        if (horatrabajadas*salariohora > 450000){
            System.out.println("El nombre del trabajador es: "+nombre+" y su salario mensual es: "+horatrabajadas*salariohora);
        }
        else{
            System.out.println("El nombre del trabajador es: "+nombre);    
        }
    }    
}
