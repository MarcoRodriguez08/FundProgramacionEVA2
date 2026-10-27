/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_27_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
         int suma = 0;   // Variable para acumular la suma de las calificaciones
        int cant = 0;   // Contador de calificaciones válidas
        
        System.out.println("Introduce las calificaciones a capturar (-1 para terminar):");
        int califa = captu.nextInt();
        
        // Usamos >= 0 en lugar de != -1 para mantenernos en el ciclo mientras la calificación sea válida
        while (califa >= 0) {
            suma += califa; // Acumulamos la calificación
            cant++;         // Aumentamos el contador
            
            System.out.println("Introduce las calificaciones a capturar (-1 para terminar):");
            califa = captu.nextInt();
        }
        
        // Validamos para evitar división entre cero
        if (cant > 0) {
            double prom = (double) suma / cant; // Casting a double para obtener decimales
            System.out.println("El promedio es: " + prom);
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }
    }
    
}
