/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion_de_segundo_grado;

public class parametros {
    public double a,b,c;
    private double solucion1, solucion2, NaN; 
    public parametros(){
        a= 0;
        b= 0;
        c= 0;
    }
    public void soluciones(double valor_de_a, double valor_de_b, double valor_de_c){
        solucion1 = ((-1*b)+Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
        solucion2 = ((-1*b)-Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
        if (solucion1==solucion2){
           System.out.println("la unica solución es : " + solucion1);
        }
       else if (Double.isNaN(solucion1)&& Double.isNaN(solucion2)){
           System.out.println("No hay soluciones");
       }
       
       else {
           System.out.println("La primera solución es "+ solucion1 + " \n La segunda solución es "+ solucion2);
       }
       
            
            
            
        }
            
       
    }
    
    

