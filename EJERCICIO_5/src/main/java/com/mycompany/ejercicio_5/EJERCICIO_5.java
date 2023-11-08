/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EJERCICIO_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int potencia = 1;
        
        System.out.println("Introduce el primer numero entero positivo");
        num1 = input.nextInt(); 
        System.out.println("Introduce el segundo numero entero positivo");
        num2 = input.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            
            potencia *= num1;
       
        }
        System.out.println("");
        System.out.println("El numero " + num1 + "elevado a " + num2 + "da como resultado " + potencia);
        
    }
}
