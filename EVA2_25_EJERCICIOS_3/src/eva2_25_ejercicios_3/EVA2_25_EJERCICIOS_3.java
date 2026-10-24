/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar un numero e imprimir su tabla de multiplicar.
        //Ejemplo: 3
        //3 X 1 = 3
        //3 X 2 = 6
        //...
        //3 X 10 = 30
        int numero;
        Scanner captu = new Scanner(System.in);
        System.out.println("La tabla del numero:");
        numero = captu.nextInt();
        captu.nextLine();
        for(int i = 1; i <= 10; i++ ){
        // EL for INICIA EN UNO TERMINA IGUAL O MENOR  10 y va de uno en uno
             System.out.println(numero + " x " + i + " = " + (numero * i));
        // imprimir el numero por x luego i luego el resulatdo de multiplicar numero * 1
        //recordando que i va de 1 a 10
            }
        }
}