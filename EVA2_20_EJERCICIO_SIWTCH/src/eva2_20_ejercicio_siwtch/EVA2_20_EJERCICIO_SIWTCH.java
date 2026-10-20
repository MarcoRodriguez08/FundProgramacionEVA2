/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_siwtch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SIWTCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //PEDIR UNA OPERACION
        //1 SUMA
        //2 RESTA
        //3 MULTIPLICACION
        //4 DIVISION
        // CUALQUIER OTRO INVALIDA
        //MOSTRAR RESULTADO
       Scanner captu = new Scanner(System.in);
       Double num1, num2;
       int ope;
       System.out.println("Ingrese dos numeros");
       num1 = captu.nextDouble();
       num2 = captu.nextDouble();
       System.out.println("¿Que quieres hacer con los numeros (1 SUMA, 2 RESTA,3 MULTIPLICACION,4 DIVISION)?");
       ope = captu.nextInt();
       switch(ope){
            case 1: 
                   System.out.println(num1+num2); 
        //Todos los caso
            break;
            case 2: 
                   System.out.println(num1-num2); 
        //Todos los caso
            break;
            case 3: 
                   System.out.println(num1*num2); 
        //Todos los caso
            break;
            case 4: 
                   System.out.println(num1/num2); 
        //Todos los caso
            break;
             default: 
         System.out.println("Dato invalido");
       }
    }
    
}
