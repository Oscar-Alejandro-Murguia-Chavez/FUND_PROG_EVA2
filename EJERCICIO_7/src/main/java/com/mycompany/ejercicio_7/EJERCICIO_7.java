/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_7;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EJERCICIO_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int mayor = 0;
        int menor = 0;
        
        System.out.println("Introduce el primer numero entero positivo o cero");
        num1 = input.nextInt(); 

        do{
            System.out.println("Introduce un numero");
            num2 = input.nextInt(); 
            
            if(num1 >= mayor){
                mayor = num1;
            }
            if(num2 > mayor){
                mayor = num2;
            }
            if(num2 < menor){
                menor = num2;
            }
            
            
        }while(num2 >= 0);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
