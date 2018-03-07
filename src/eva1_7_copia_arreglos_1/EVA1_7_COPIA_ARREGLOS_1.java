/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_arreglos_1;

/**
 *
 * @author Evelyn
 */
public class EVA1_7_COPIA_ARREGLOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatosOrigen[] = new int [5];//LLENADO POR SEPARADO
        aiDatosOrigen[0] = 10;
        aiDatosOrigen[1] = 20;
        aiDatosOrigen[2] = 30;
        aiDatosOrigen[3] = 40;
        aiDatosOrigen[4] = 50;
        //MI "COPIA DEL ARREGLO"
        int aiCopia[];                
        aiCopia= aiDatosOrigen;
       // for (int b : aiCopia) {
         //   System.out.println("");
        //}
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);            
        }
        //MODIFICO aiDatosOrigen 
        aiDatosOrigen[2] = 99999;
        //IMPRMIR COPIA
        System.out.println("imprimiendo la copia");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
        }
        //DIRECCION DE MEMORIA A LA QUE APUNTAN, APUNTAN A LA MISMA DIRECCIONS PORQUE SON LO MISMO 
        System.out.println(aiDatosOrigen);
        System.out.println(aiCopia);
        
    }
    
    
}
