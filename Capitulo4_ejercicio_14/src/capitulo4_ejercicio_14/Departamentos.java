/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4_ejercicio_14;

/**
 *
 * @author 57302
 */
public class Departamentos {
    public double V_departamento1,V_departamento2,V_departamento3,sueldo;
    private double venta_total;
    public void Departamentos(){
    V_departamento1= 0;
    V_departamento2= 0;
    V_departamento3= 0;
    sueldo = 0;
    }
    public void valor_a_pagar_a_los_departamentos (double Ventas_dp1, double Ventas_dp_2,double Ventas_dp_3, double sueldos){
       
       venta_total = Ventas_dp1 + Ventas_dp_2 + Ventas_dp_3;
       if (Ventas_dp1 >= venta_total*0.33){
           System.out.println("El valor a pagar de sueldo al departamento 1  es "+ (sueldos+sueldos*0.2) );
       }
       else{
           System.out.println("El valor a pagar de sueldo al departamento 1  es "+ sueldos );
       }
       if (Ventas_dp_2 >= venta_total*0.33){
           System.out.println("El valor a pagar de sueldo al departamento 2  es "+ (sueldos+sueldos*0.2) );
       }
       else{
           System.out.println("El valor a pagar de sueldo al departamento 2  es "+ sueldos );
       }
       if (Ventas_dp_3 >= venta_total*0.33){
           System.out.println("El valor a pagar de sueldo al departamento 3  es "+ (sueldos+sueldos*0.2) );
       }
       else{
           System.out.println("El valor a pagar de sueldo al departamento 3  es "+ sueldos );
       }
       
       
           
        
       
    
    }
           
    
    
    
    
}
