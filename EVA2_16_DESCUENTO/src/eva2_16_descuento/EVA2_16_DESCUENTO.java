/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

public class EVA2_16_DESCUENTO {

public static void main(String[] args) {

    Scanner captu = new Scanner(System.in);

    int edad;
    String estudiante, credencialVigente, insen;

System.out.println("Que edad tienes?");
        edad = captu.nextInt();
        captu.nextLine(); // Limpiar el buffer

        // 1. Si es menor de edad, tiene descuento directo
        if (edad < 18) {
            System.out.println("TIENES DESCUENTO (Por ser menor de edad)");
        } 
        // 2. Si no es menor de edad, evaluamos si puede ser estudiante (ej. mayores de 18 que estudian)
        else {
            System.out.println("Eres estudiante? (S/N)");
            estudiante = captu.nextLine();

            if (estudiante.equalsIgnoreCase("S")) {
                System.out.println("Tienes credencial vigente? (S/N)");
                credencialVigente = captu.nextLine();

                if (credencialVigente.equalsIgnoreCase("S")) {
                    System.out.println("TIENES DESCUENTO (Estudiante con credencial vigente)");
                } else {
                    System.out.println("NO TIENES DESCUENTO (Credencial no vigente)");
                }
            } 
            // 3. Si no es menor ni estudiante, evaluamos si es adulto mayor (60 años o más)
            else if (edad >= 60) {
                System.out.println("Tienes credencial INSEN? (S/N)");
                insen = captu.nextLine();

                if (insen.equalsIgnoreCase("S")) {
                    System.out.println("Tienes credencial vigente? (S/N)");
                    credencialVigente = captu.nextLine();

                    if (credencialVigente.equalsIgnoreCase("S")) {
                        System.out.println("TIENES DESCUENTO (Adulto mayor con INSEN vigente)");
                    } else {
                        System.out.println("NO TIENES DESCUENTO (Credencial INSEN no vigente)");
                    }
                } else {
                    System.out.println("NO TIENES DESCUENTO (No cuentas con credencial INSEN)");
                }
            } 
            // 4. Si no cae en ninguna categoría de descuento
            else {
                System.out.println("NO TIENES DESCUENTO");
            }
        }
        }
    }
