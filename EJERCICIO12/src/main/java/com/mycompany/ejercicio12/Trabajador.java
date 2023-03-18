/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio12;
public class Trabajador {
    public String N_trabajador;
    public int H_trabajadas;
    public double V_horatrabajo;
    public double salario;
    
    public void Trabajador(){
        N_trabajador="";
        H_trabajadas = 0;
        V_horatrabajo = 0;
    }
    
    public void nombre(String nombreT){
        System.out.println("El nombre del trabajador es:" + nombreT);
    }
    public void salario (double horaT, double valorHT){
        if (horaT<=40){
            salario = horaT*valorHT;
        }
        else {
            
            if (horaT-40<=8){
                salario = (40*valorHT)+((horaT-40)*2*valorHT);
            }
            else{
                salario =(40*valorHT)+(8*2*valorHT)+((horaT-48)*3*valorHT);
            }
        }
        System.out.println("El salario devengado es:" + salario);
    }    
}
