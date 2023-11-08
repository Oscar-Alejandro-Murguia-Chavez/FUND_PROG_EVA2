/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EJERCICIO_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Introduce el primer numero entero positivo");
        num1 = input.nextInt(); 
        System.out.println("Introduce el segundo numero entero positivo");
        num2 = input.nextInt(); 
        
        System.out.println("-----");
        if(num1 >= num2){
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
            
        
    }
}
