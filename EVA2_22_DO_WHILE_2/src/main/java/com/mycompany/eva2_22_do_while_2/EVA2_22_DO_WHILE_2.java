/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_22_do_while_2;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_22_DO_WHILE_2 {
final static String NOMBRE_USUARIO="Admin";
final static String PASSWORD="Admin";
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String usuario;
        String pwd;
        
        do {
            System.out.print("Introduce el Usuario: ");
            usuario=input.nextLine();
            System.out.print("Introduce la contraseña: ");
            pwd= input.nextLine();
            
        }while((!usuario.equals(NOMBRE_USUARIO))||(!pwd.equals(PASSWORD)));
        System.out.println("¡¡¡¡BIENVENIDO AL SISTEMA!!!!");
    }
}
