/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio15;
public class Esferas {
    public double esferaA, esferaB, esferaC, esferaD; 
    
    public void Esferas(){
        esferaA = 0;
        esferaB = 0;
        esferaC = 0;
        esferaD = 0;
    }
    public void comparar (double esfeA, double esfeB, double esfeC, double esfeD){
        if(esfeA==esfeB){
            if (esfeB==esfeC){
                if (esfeA>esfeD){
                System.out.println("La esfera diferente es D y su peso es menor que el de las otras tres");
                }
                else{
                System.out.println("La esfera diferente es D y su peso es mayor que el de las otras tres");    
                }
            }
            if (esfeB==esfeD){
                if (esfeA>esfeC){
                System.out.println("La esfera diferente es C y su peso es menor que el de las otras tres");
                }
                else{
                System.out.println("La esfera diferente es C y su peso es mayor que el de las otras tres");    
                }
            }
        }
        if(esfeD==esfeC){
            if (esfeB==esfeC){
                if (esfeD>esfeA){
                System.out.println("La esfera diferente es A y su peso es menor que el de las otras tres");
                }
                else{
                System.out.println("La esfera diferente es A y su peso es mayor que el de las otras tres");    
                }
            }
            if (esfeA==esfeC){
                if (esfeD>esfeB){
                System.out.println("La esfera diferente es B y su peso es menor que el de las otras tres");
                }
                else{
                System.out.println("La esfera diferente es B y su peso es mayor que el de las otras tres");    
                }
            }
        }
    }
}