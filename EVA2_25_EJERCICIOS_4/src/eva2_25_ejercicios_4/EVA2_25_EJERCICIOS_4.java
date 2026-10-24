/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicita dos numeros: Base y Exponente. Calcular la potencia:
        //Ejemplo 3 y 2
        //Resultado: 3 elevado a la 2 = 9
        Scanner captu = new Scanner(System.in);
        int base, exponente;
        int resultado = 1;
        System.out.print("Escribe la bbase: ");
        base = captu.nextInt();
        System.out.print("Escribe el sexponente: ");
        exponente = captu.nextInt();
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        System.out.println(base + " elevado a la " + exponente + " = " + resultado);
    }
}
