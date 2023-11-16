/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_9;

import java.util.*;

/**
 *
 * @author Alex
 */
public class EJERCICIO_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cadena;
        String caracter;
        int numCaracteres = 0;
        
        System.out.println("Ingresa la cadena que quieres comprobar");
        cadena = input.nextLine();
        
        System.out.println("Introduce el caracter que quieres buscar");
        caracter = input.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            String charat = String.valueOf(cadena.charAt(i));
            if(charat.equals(caracter)){
                numCaracteres++;
            }
        }
        System.out.println("El numero de veces que aparece " + caracter + " es " + numCaracteres);
        
    }
}
