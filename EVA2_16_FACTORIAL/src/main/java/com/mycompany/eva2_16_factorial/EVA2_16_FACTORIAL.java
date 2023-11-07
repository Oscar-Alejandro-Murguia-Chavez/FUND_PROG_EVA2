/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_factorial;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_16_FACTORIAL {

    public static void main(String[] args) {        
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("Ingrese un número de veces: ");
        int num=input.nextInt();
        
        int factorial=1;
        
                
        for (int i = 1; i <= num; i++) {
            System.out.print(i +" x ");
            factorial= factorial*i;
        }
        
        System.out.println("");
        System.out.println("Factorial de "+num+" es: "+factorial);
        System.out.println("");
        
        int factorial1=1;
         for(int i=num; i >=1; i--){
            System.out.print(i+" x ");
            factorial1= factorial1*i;
            }
         System.out.println("");
         System.out.println("Factorial de "+num+" es: "+factorial1);
    
    }
}
