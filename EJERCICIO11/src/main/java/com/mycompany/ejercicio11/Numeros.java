
package com.mycompany.ejercicio11;
public class Numeros {
    public double N1;
    public double N2;
    public double N3;
    
    public void Numeros (){
        N1 = 0;
        N2 = 0;
        N3 = 0;
    }
    
    public void mayor(double N1,double N2,double N3){
        if (N1>N2&&N1>N3){
            System.out.println("El mayor es:"+N1);}
        else if (N2>N1&&N2>N3){
            System.out.println("El mayor es:"+N2);}
        else {
            System.out.println("El mayor es:"+N3);}
        
    }
}
