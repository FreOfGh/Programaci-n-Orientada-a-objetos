/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio24;

/**
 *
 * @author maria
 */
public class Esferas {
    public double esferaA, esferaB, esferaC;
    
    public void esferas(){
        esferaA = 0;
        esferaB = 0;
        esferaC = 0;        
    }
    public void comparar (double esfeA, double esfeB, double esfeC){
        if (esfeA>esfeB){
            if (esfeA>esfeC){
                System.out.println("La esfera A es la de mayor peso");
            }
        }
        else if (esfeB>esfeA){
            if (esfeB>esfeC){
                System.out.println("La esfera B es la de mayor peso");
            }
        }
        else{
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}
