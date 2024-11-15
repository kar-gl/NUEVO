/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espoch.sistemasolar.clases;
import ec.edu.espoch.sistemasolar.enumeracion.TipoPlaneta;

/**
 *
 * @author SO-LAB1-PC14
 */
    public class Planeta {
    public String nombre;
    public int cantidadSatelite;
    public double masaKilometro;
    public double volKm3;
    public int kilometro;
    public int distanciaMedidaSol;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior =false;
     
    public Planeta(){

}
   

           public Planeta(String nombre, int cantidadSatelite, double masaKilometro, double volKm3, int kilometro, int distanciaMedidaSol, TipoPlaneta tipoPlaneta) {
           this.nombre = nombre;
            this.cantidadSatelite = cantidadSatelite;
            this.masaKilometro = masaKilometro;
            this.volKm3 = volKm3;
            this.kilometro = kilometro;
            this.distanciaMedidaSol = distanciaMedidaSol;
            this.tipoPlaneta = tipoPlaneta;
           
        }
       
    }

    public void imprimir(){
    System.out.println("Nombre:"+ nombre);
     System.out.println("Cantidad de satelites:"+ cantidadSatelite);
     System.out.println("Masa en kilometros:"+masaKilometro);
     System.out.println("Volumen en kilogramos:"+ volKm3);
     System.out.println("Diametros :"+ kilometro);
     System.out.println("Distancia:"+distanciaMedidaSol);
     System.out.println("Tipo planeta "+tipoPlaneta);
     
}
public double calcularDensidadPlaneta(){
return masaKilometro/volKm3;
        }

public boolean exterior(){
 double maximo=3.4;
 double distancia=14597870;
 double limite =maximo*distancia;

}

