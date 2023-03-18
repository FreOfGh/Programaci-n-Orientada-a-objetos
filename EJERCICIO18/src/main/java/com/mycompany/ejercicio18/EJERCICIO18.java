

package com.mycompany.ejercicio18;

import java.util.Scanner;
public class EJERCICIO18 {

    public static void main(String[] args) {
        Scanner entrada_usuario_codigo = new Scanner(System.in);
        Scanner entrada_usuario_nombres = new Scanner(System.in);
        Scanner entrada_usuario_horas_trabajadas = new Scanner(System.in);
        Scanner entrada_usuario_Valor_hora_empleado = new Scanner(System.in);
        Scanner entrada_usuario_retencion = new Scanner(System.in);
        
        
        Empleado empleado_fabrica = new Empleado ();
        
        System.out.println("Por favor ingrese el codigo del empleado");
        empleado_fabrica.C_empleado = entrada_usuario_codigo.nextInt();
       
        System.out.println("Por favor ingrese el nombre de el empleado");
        empleado_fabrica.Nombres = entrada_usuario_nombres.next();
        
        System.out.println("Por favor ingrese las horas trabajadas");
        empleado_fabrica.N_horastrabajo = entrada_usuario_horas_trabajadas.nextInt();
        
        System.out.println("Por favor ingrese el valor de la hora");
        empleado_fabrica.V_horatrabajada = entrada_usuario_Valor_hora_empleado.nextInt();
        
        System.out.println("Por favor ingrese la retencion");
        empleado_fabrica.P_retencion = entrada_usuario_retencion.nextDouble();
        
        //ACCIONES
        
        empleado_fabrica.Codigo_empleado(empleado_fabrica.C_empleado);
        empleado_fabrica.Nombres(empleado_fabrica.Nombres);
        empleado_fabrica.Salario_bruto(empleado_fabrica.V_horatrabajada, empleado_fabrica.N_horastrabajo);
        empleado_fabrica.Salario_Neto(empleado_fabrica.V_horatrabajada, empleado_fabrica.N_horastrabajo, empleado_fabrica.P_retencion);
        
        
        
       
        
        
        
        
    }
}
