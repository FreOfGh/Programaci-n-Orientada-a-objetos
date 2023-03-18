/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_capitulo4;
import java.util.Scanner;
/**
 *
 * @author 57302
 */
public class Ejercicio13_capitulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner compra_1 = new Scanner(System.in);
        Scanner balota = new Scanner(System.in);
        Descuento cliente = new Descuento();
        System.out.println("Ingrese el valor de la compra : ");
        cliente.valor_de_compra =  compra_1.nextDouble();
        System.out.println("Ingrese el color de la balota : ");
        cliente.color = balota.next();
        
        cliente.valor_a_pagar(cliente.color, cliente.valor_de_compra);
        
        
    }
    
}
