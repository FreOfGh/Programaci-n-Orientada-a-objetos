/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7_capitulo4;
import java.util.Scanner  ; 
/**
 *
 * @author 57302
 */
public class Ejercicio_7_capitulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada_numero_A =  new Scanner(System.in);
        Numeros comparacion_de_numeros = new Numeros();
        
        
        Scanner entrada_numero_B =  new Scanner(System.in);
        System.out.println("Ingrese el numero A");
        
        
        comparacion_de_numeros.a = entrada_numero_A.nextDouble();
        System.out.println("Ingrese el numero B");
        comparacion_de_numeros.b = entrada_numero_B.nextDouble();
        comparacion_de_numeros.comparacion(comparacion_de_numeros.a,comparacion_de_numeros.b);
        
    }
    
}
