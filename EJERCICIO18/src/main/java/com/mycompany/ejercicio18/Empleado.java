
package com.mycompany.ejercicio18;

public class Empleado {
    public int C_empleado, N_horastrabajo, V_horatrabajada;
    public double P_retencion;
    public String Nombres;
    
    public void Empleado (){
        C_empleado = 0;
        N_horastrabajo = 0;
        V_horatrabajada = 0;
        P_retencion= 0;
        Nombres="";             
    }
    
    public void Codigo_empleado(int Codigo_empleado){
        System.out.println(Codigo_empleado);
    }
    public void Nombres(String Nombres){
        System.out.println(Nombres);
    }
    public void Salario_bruto(int Valor_hora, int Horas_trabajadas){
        System.out.println("Salario Bruto:"+(Valor_hora*Horas_trabajadas));
    }
    public void Salario_Neto(int Valor_hora, int Horas_trabajadas, double retencion){
        System.out.println("Salario Neto:"+((Valor_hora*Horas_trabajadas)-((retencion/100)*(Valor_hora*Horas_trabajadas))));
    }
}
