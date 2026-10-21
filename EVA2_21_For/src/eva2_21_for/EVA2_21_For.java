/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

/**
 *
 * @author Usuario
 */
public class EVA2_21_For {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //Acceso de indíces --> i
      //IMPRIMIR UN LISTADO DEL 1 AL 10:
      //3 parámetros
      //punto de partida
      //condicion para detenerse
      //avance --> de uno en uno
      for(int i = 1; i <= 10; i++){   // es igualfor(int i = 1; i <= 10; i = 1 + i)
      System.out.print(i + "-");
      }
      
      System.out.println();
      
      
      //20 22 224 25 28 30 32 34 36 38
      for(int i = 20;  i<= 38; i+=2){
      System.out.print(i + "-");}
      
      System.out.println();
         
         
      for(int i = 0; i < 10;  i ++){
      System.out.print(i + " - ");
         }
      int x;
      for(x = 10; x >= 1; x-- ){
         System.out.print(x + " - ");
      }
      System.out.println();
      //del 10 al 1
      for(int i = 0; i<=20; i +=2){
      System.out.print(i + " - ");}
      //Pares entre 0 y 20
      
      
      
      
      
   //{}obligatorias   
   }
   
}
