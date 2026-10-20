/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_15_BECA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //BECA
      //Promedio > 80
      //Ingresos < 10000
      //AMBAS TIENEN QUE CUMPLIRSE
      Scanner captu = new Scanner(System.in);
      int promedio, ingresos;
      System.out.println("Cuantos son tus Ingresos ");
      ingresos = captu.nextInt();
      System.out.println("Cual es tu promedio? ");
      promedio = captu.nextInt();
      
      //CONDICIONES PARA DAR BECA:
      if ((promedio > 80) && (ingresos < 10000)){
      System.out.println("Beca Concedida !!");
     
      }else{
      System.out.println("Beca Denegada!!");
      }
   }
 }
