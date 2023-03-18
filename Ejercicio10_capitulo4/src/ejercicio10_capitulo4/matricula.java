/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10_capitulo4;


public class matricula {
    public double patrimonio;
    public int E_social;
    public String N_inscripcion, Nombres;
    public void matricula(){
    
        patrimonio = 0;
        E_social = 0;
        N_inscripcion = "";
        Nombres = "";   
}
    public void nombre_candidato(String nombre_candidato){
        System.out.println("El nombre del candidato a matricula es :  " + nombre_candidato);
    }
     public void numero_de_inscripcion(String N_inscripcion ){
        System.out.println("El nombre del candidato a matricula es :  " + N_inscripcion);
    }
     public void valor_a_pagar(double patrimonio, int estracto_social ){
        if (patrimonio>2000000 && estracto_social>3){
            System.out.println("El estudiante debera pagar el valor de $"+  (50000+0.03*(patrimonio)));
        }
        else{
            System.out.println("El estudiante debera pagar el valor de $"+ 50000);
        }
        
    }
}
