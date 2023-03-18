/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_capitulo4;


public class Descuento {
    public String color;
    public double valor_de_compra;
    
    public void Descuento (){
        color = "";
        valor_de_compra = 0;
    }
    public void valor_a_pagar(String pelota , double compra){
       
            switch (pelota) {
            case "Blanca" -> System.out.println("El valor a pagar es  "+ compra);
            case "verde" -> System.out.println("El valor a pagar es  "+ (compra-compra*0.10));
            case "amarilla" -> System.out.println("El valor a pagar es  "+ (compra-compra*0.25));
            case "azul" -> System.out.println("El valor a pagar es "+ (compra-compra*0.50));
            default -> System.out.println("El valor a pagar es  "+ 0);
        }
    }
    
    
}
    

