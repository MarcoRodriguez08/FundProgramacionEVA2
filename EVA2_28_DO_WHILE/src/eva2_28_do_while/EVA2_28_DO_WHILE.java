/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_28_DO_WHILE {
    static final String USUARIO = "admin";
    static final String CONTRA = "pin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String usu, pwd;
        
        do{
        System.out.println("USUARIO:");
        usu = captu.nextLine();
        System.out.println("USUARIO:");
        pwd = captu.nextLine();
        
        }while(!(usu.equals(USUARIO)) || !(pwd.equals(CONTRA)));  //Mientras se esto verdad el resto se repite
         // cuadno esto NO es correcto  0 Cuando la contraseña NO sea correcta
         //Entonces si no es verdad el ususario o la contraseña entonces se seguira repitiendo
         //pero si la condicion en falsa  pasa a lo que sigue, en esete caso acceso concedidio
//! es no        
        
        System.out.println("ACCESO CONCECDIDO");                                           
        
    }
    
}
