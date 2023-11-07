/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_ciclos_anidados;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nume;
        
        System.out.println("Introduce un numero");
        nume=input.nextInt();
        for (int i = 1; i <= nume; i++) {
            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        for (int i = nume; i >= 1; i--) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
