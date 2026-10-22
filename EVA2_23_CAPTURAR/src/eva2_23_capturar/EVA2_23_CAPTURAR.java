/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //SOLICITAR CALIFICACIONES Y PROMEDIAR
      Scanner captu = new Scanner(System.in);
      int  cant, califa = 0;
      double prom;
      System.out.println("¿Cuántas calificaciones va a capturar");
      cant = captu.nextInt();                                                          
      captu.nextLine();                                             
      for(int i = 1; i <= cant; i++){
         //INICIO, FIN, AVANCE ,CANT
      System.out.println("Captura la calificación");
      califa = califa + captu.nextInt();
      captu.nextLine();
      //for(int i = 0; i < cant; i++){
      //System.out.println("Captura la calificación");
      //califa = captu.nextInt();
      //captu.nextLine();  ES EXctMENTE LO MISMO
      }

      System.out.println("ACUMULADO =" + califa);
      prom = califa/(cant*1.0);                  //MULTIPLICANDO UNA VARTIABLE POR 1.0 LOMCONVIERTE EN DOUBLE
      System.out.println("PROMEDIO =" + prom);  
   }
   
}
