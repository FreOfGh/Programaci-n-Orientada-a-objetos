/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4_ejercicio_14;
import java.util.Scanner;
/**
 *
 * @author 57302
 */
public class Capitulo4_ejercicio_14 {

   
    public static void main(String[] args) {
        Departamentos sueldos_de_los_empleados = new Departamentos();
        Scanner Ventas_dp_1 = new Scanner(System.in);
        Scanner Ventas_dp_2 = new Scanner(System.in);
        Scanner Ventas_dp_3 = new Scanner(System.in);
        Scanner sueldos = new Scanner(System.in);
        System.out.println("Porfavor ingrese las ventas del departamento 1");
        sueldos_de_los_empleados.V_departamento1 = Ventas_dp_1.nextDouble();
        System.out.println("Porfavor ingrese las ventas del departamento 2");
        sueldos_de_los_empleados.V_departamento2 = Ventas_dp_2.nextDouble();
        System.out.println("Porfavor ingrese las ventas del departamento 3");
        sueldos_de_los_empleados.V_departamento3= Ventas_dp_3.nextDouble();
        System.out.println("Porfavor los dueldos de los departamentos ");
        sueldos_de_los_empleados.sueldo =  sueldos.nextDouble();
        sueldos_de_los_empleados.valor_a_pagar_a_los_departamentos(sueldos_de_los_empleados.V_departamento1, sueldos_de_los_empleados.V_departamento2, sueldos_de_los_empleados.V_departamento3, sueldos_de_los_empleados.sueldo);
        
        
    }
    
}
