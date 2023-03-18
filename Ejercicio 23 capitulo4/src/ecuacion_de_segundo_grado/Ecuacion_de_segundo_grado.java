/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion_de_segundo_grado;
import java.util.Scanner;
/**
 *
 * @author 57302
 */
public class Ecuacion_de_segundo_grado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        parametros ecuacion = new parametros();
        System.out.println("Porfavor ingrese el valor A de la ecuación de segundo grado");
        ecuacion.a = a.nextDouble();
        System.out.println("Porfavor ingrese el valor B de la ecuación de segundo grado");
        ecuacion.b = b.nextDouble();
        System.out.println("Porfavor ingrese el valor C de la ecuación de segundo grado");
        ecuacion.c = c.nextDouble();
        ecuacion.soluciones(ecuacion.a, ecuacion.b, ecuacion.c);
    }
    
}
