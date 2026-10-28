/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author bisonte
 */
public class EVA2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir todos los numeros pares
        for (int i = 0; i <=20 ; i ++){
         //donde incia/cuando acaba/cada cuanto
         //para saber si es par me interesa me interesa el residuo
         int residuo = i % 2;
         if (residuo == 0 ){
         
            System.out.println(i + "-");
        }
            continue ;// INTERUMPE LA ITERACION ACTUAL
            
        }
       // System.out.println("SI EL NUMERO ES PAR");
        
    }
    
}