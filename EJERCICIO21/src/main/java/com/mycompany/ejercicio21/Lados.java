/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio21;
public class Lados {
    public double L1;
    public double L2;
    public double L3;
    public double s;
    
    public void Lados(){
        L1 = 0;
        L2 = 0;
        L3 = 0;
        
    }
    
    public void perimetro (double L1,double L2,double L3){
        System.out.println("El perimetro es:"+(L1+L2+L3));
    }
    public void semiperimetro (double L1,double L2,double L3){
        System.out.println("El semiperimetro es:"+((L1+L2+L3)/2));
    }
    public void area (double L1,double L2,double L3){ 
        s = (L1+L2+L3)/2;
        System.out.println("El area es:"+(Math.sqrt((s*(s-L1))*(s-L2)*(s-L3))));
    }    
}
