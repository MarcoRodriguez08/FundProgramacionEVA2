/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //BECA
      //Promedio >= 95
      //esta en equipo representativo
      //CAPTURA
      Scanner captu = new Scanner(System.in);
      int promedio;
      String equipo;
      System.out.println("Perteneces a equipos representativos (S/N) ");
      equipo = captu.nextLine();
      System.out.println("Cual es tu promedio? ");
      promedio = captu.nextInt();
      
      //CONDICIONES PARA DAR BECA:
      if ( (promedio >= 95) || equipo.equals("S") ){
      System.out.println("Beca Concedida !!");
     
      }else{
      System.out.println("Beca Denegada!!");
      }
   }
 }
