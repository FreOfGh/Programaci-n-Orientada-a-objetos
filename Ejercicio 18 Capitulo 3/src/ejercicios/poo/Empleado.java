/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.poo;

public class Empleado {
    public int C_empleado, N_horastrabajadas,V_hora; // atributos de la clase empleado de tipo numerico
    public double P_retencion;
    public String   Nombres; // atributos de la clase empleado de tipo string 
    public void Empleado(){ // constructor
        C_empleado = 0; // valaores iniciales
        N_horastrabajadas =0;  // valaores iniciales
        V_hora = 0;  // valaores iniciales
        P_retencion= 0;  // valaores iniciales
        Nombres ="";            // valaores iniciales
    }
    
     public void Codigo_empleado(int Codigo_empleado){ // metodo para mostrar el código del empleado
        System.out.println("El codigo del empleado es " + Codigo_empleado);
    }
    public void Nombres(String Nombres_1){ // metodo para mostrar el nombre del empleado
        System.out.println("El nombre del empleado es "+ Nombres_1);
    } 
    public void Salario_bruto(int Valor_hora, int Horas_trabajadas ){ // metodo para mostrar el salario_bruto del empleado
        
        System.out.println("El salario bruto del empleado es "+ Valor_hora*Horas_trabajadas);
    }
    public void Salario_neto(int Valor_hora, int Horas_trabajadas, Double retencion ){ // Metodo salario neto
        System.out.println("El salario neto del empleado es " + ((Valor_hora*Horas_trabajadas)-(retencion/100)*(Valor_hora*Horas_trabajadas)));
    }

        
    
    
}
