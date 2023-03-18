/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.poo;
import java.util.Scanner;
/**
 *
 * @author 57302
 */
public class EjerciciosPoo {
 
    
    public static void main(String[] args) {
        Scanner entrada_usuario_codigo_empleado =  new Scanner(System.in);
        Scanner entrada_usuario_nombres =  new Scanner(System.in);
        Scanner entrada_usuario_horas_trabajadas =  new Scanner(System.in);
        Scanner entrada_usuario_valor_hora_empleado =  new Scanner(System.in);
        Scanner entrada_usuario_retefuente =  new Scanner(System.in);
        Empleado empleado_fabrica = new Empleado();

        System.out.println("Porfavor ingrese el codigo del empleado");
        empleado_fabrica.C_empleado = entrada_usuario_codigo_empleado.nextInt();
        
        System.out.println("Porfavor ingrese el nombre del empleado");
        empleado_fabrica.Nombres = entrada_usuario_nombres.next();
        
        System.out.println("Porfavor ingrese el numero de horas trabajadas del empleado");
        empleado_fabrica.N_horastrabajadas = entrada_usuario_horas_trabajadas.nextInt();
        
        System.out.println("Porfavor ingrese el valor de hora trabajada del empleado");
        empleado_fabrica.V_hora = entrada_usuario_valor_hora_empleado.nextInt();
        
        System.out.println("Porfavor ingrese el valor de retefuente del empleado");
        empleado_fabrica.P_retencion = entrada_usuario_retefuente.nextDouble();
        
        // acciones 
        empleado_fabrica.Codigo_empleado(empleado_fabrica.C_empleado);
        empleado_fabrica.Nombres(empleado_fabrica.Nombres);
        empleado_fabrica.Salario_bruto(empleado_fabrica.V_hora, empleado_fabrica.N_horastrabajadas);
        empleado_fabrica.Salario_neto(empleado_fabrica.V_hora, empleado_fabrica.N_horastrabajadas, empleado_fabrica.P_retencion);
        
        
        
        
        
        
       

   
        
        
        
    }
    
}
