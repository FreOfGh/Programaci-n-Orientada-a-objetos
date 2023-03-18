/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7_capitulo4;

public class Numeros {
    public double a,b;
    public void numeros(){
        a= 0;
        b = 0;   
    }
   public void comparacion (double a_1,double b_1){
       if (a_1 > b_1){
           System.out.println(a_1 + " es mayor" + b_1);
           }   
       else if (a_1 == b_1){
           System.out.println(a_1 + " es igual a " +b_1);
       }
       else
           System.out.println(b_1 + " es mayor " + a);
       
       
   }
    
}
