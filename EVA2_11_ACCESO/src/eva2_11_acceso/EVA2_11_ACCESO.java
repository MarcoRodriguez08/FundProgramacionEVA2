/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_ACCESO {
    final static String USUARIO = "Admin";
    final static String PWD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario,pwd;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña: ");
        pwd = captu.nextLine();
        //usuario.equals(USUARIO) UNA ALTERNATIVA SEGURA PARA COMPARAR CADENAS
        if(usuario.equals(USUARIO) && pwd.equals(pwd)){
              if (pwd.equals(PWD)){
                  System.out.println("ACCESO CONCEDIDO!!!!!!!!!!");
              }else{
                      System.out.println("ACCESO DENEGADO!!!!!!");
              }
        }else{
        System.out.println("ACCESO DENEGADO!!!!!!");
                      }
                  }
              }
    
