/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menus;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_8_Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opción;
        Scanner captu = new Scanner(System.in);
        System.out.println(">>>>>>>>>>Menu la cuchara crocante<<<<<<<<<<<<<<");
        System.out.println("1-ventas");
        System.out.println("2-Priveedores");
        System.out.println("3-Empleados");
        System.out.println("4-Inventario");
        System.out.println("5-Salir");
        System.out.println("Seleccione una opción");
        opción = captu.nextInt();
        if(opción == 1)
            System.out.println("Muestra ventanas de ventas");
        
        else if(opción == 2)
            System.out.println("Muestra proveedores");
        
        else if(opción == 3)
            System.out.println("Muestra Empleados");
        
        else if(opción == 4)
            System.out.println("Muestra Inventario");
        
        else if(opción == 5)
            System.out.println("Bye");
        
        else {
            System.out.println("Escriba algo bien");
        }
        
    }    
      
}
