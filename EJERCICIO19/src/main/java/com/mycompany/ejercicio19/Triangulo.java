/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio19;
public class Triangulo {
    public double Lado;
    
    public void Tiangulo (){
        Lado = 0;
    }
    
    public void perimetro (double Lado){
        System.out.println("El perimetro es:"+(Lado*3));
    }
    public void altura (double Lado){
        System.out.println("La altura es:"+((Math.sqrt(3)*Lado)/2));
    }
    public void area (double Lado){
        System.out.println("El area es:"+((Math.pow(Lado, 2)*Math.sqrt(3))/4));
    }
}
