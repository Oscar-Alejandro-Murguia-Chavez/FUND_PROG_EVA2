/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA2_19_WHILE_INFINITO {

    public static void main(String[] args) {
        
        int nume=100;
        int captu=0;
        Scanner input = new Scanner(System.in);
        
        while(true){
            
            System.out.println("itroduce el numero:");
            captu=input.nextInt();
            if(captu==nume){
                System.out.println("adivinaste");
                break;
            }
            
        }
        
    }
}
