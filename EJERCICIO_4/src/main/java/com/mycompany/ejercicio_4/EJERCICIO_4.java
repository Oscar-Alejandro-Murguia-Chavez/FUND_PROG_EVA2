/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EJERCICIO_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int repito = 0;
        
        
        
        do{
            System.out.println("Introduce un numero");
            num = input.nextInt();
            
            if(num > 0){
                System.out.println("El numero es positivo");
            }else if(num < 0){
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es cero"); 
            }
            
            System.out.println("Desea que se repita el programa? ");
            System.out.println("0 = si");
            System.out.println("1 = no");
            repito = input.nextInt();
            
        }while(repito == 0);
        
    }
}
