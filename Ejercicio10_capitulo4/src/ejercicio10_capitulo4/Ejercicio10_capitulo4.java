/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10_capitulo4;
import java.util.Scanner;

public class Ejercicio10_capitulo4 {

    
    public static void main(String[] args) {
        matricula estudiante = new matricula();
        Scanner Nombre = new Scanner(System.in);
        Scanner N_inscripcion = new Scanner(System.in);
        Scanner estracto = new Scanner(System.in);
        Scanner patrimonio =new Scanner(System.in);
        System.out.println("Ingrese el nombre del candidato a pagar matricula");
        estudiante.Nombres = Nombre.next();
        System.out.println("Ingrese el Numero de inscripción del candidato a pagar matricula");
        estudiante.N_inscripcion =  N_inscripcion.next();
        System.out.println("Ingrese el patrimonio del candidato a pagar matricula");
        estudiante.patrimonio = patrimonio.nextDouble();
        System.out.println("Ingrese el estracto del candidato a pagar matricula");
        estudiante.E_social = estracto.nextInt();

        estudiante.nombre_candidato(estudiante.Nombres);
        estudiante.numero_de_inscripcion(estudiante.N_inscripcion);
        estudiante.valor_a_pagar(estudiante.patrimonio, estudiante.E_social);
    }
    
}
