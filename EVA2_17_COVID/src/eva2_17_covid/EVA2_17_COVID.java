/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_17_COVID {

    
    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);

    int edad;
    double peso, IMC, estatura;
    String enfermedadcronica;

   System.out.println("Que edad tienes?");
        edad = captu.nextInt();
        captu.nextLine();
        
        System.out.println("Cual es tu Estatura?");
        estatura = captu.nextFloat();
        captu.nextLine();
        
        System.out.println("Cual es tu Peso? (kg)");
        peso = captu.nextDouble();
        captu.nextLine();
        
        System.out.println("Poses Una Enfermedad Cronica? (S/N)");
        enfermedadcronica = captu.nextLine();

        IMC = peso / (estatura * estatura);
        System.out.print("Tu IMC Es= ");
        System.out.println(IMC);
        
        // IMC
        if (IMC < 18.5) {
            System.out.println("AVISO: Tu IMC está por debajo del estándar");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Tu IMC se encuentra dentro del rango estándar");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("AVISO: Tu IMC está por encima del estándar");
        } else {
            System.out.println("Tu IMC está por encima del estándar");
        }
       
        
        if ((edad >= 60) || (enfermedadcronica.equalsIgnoreCase("S")) || (IMC >= 25)){
            System.out.println("ESTAS EN RIESGO");
        } else {
            System.out.println("NO ESTAS EN RIESGO");
        }
    }
}

