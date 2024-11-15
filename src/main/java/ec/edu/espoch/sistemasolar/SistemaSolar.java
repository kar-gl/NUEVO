/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar;
import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.clases.enumeracion.TipoPlaneta;
/**
 *
 * @author SO-LAB1-PC14
 */
public class SistemaSolar {

    public static void main(String[] args) {
        
        Planeta objPlaneta=new Planeta();
        
        objPlaneta.nombre="Marte";
        objPlaneta.cantidadSatelite=0;
        objPlaneta.masaKilometro=0;
        objPlaneta.volKm3=0;
        objPlaneta.kilometro=0;
        objPlaneta.distanciaMedidaSol=0;
        objPlaneta.tipoPlaneta=TipoPlaneta.TERRESTRE;
                }
}