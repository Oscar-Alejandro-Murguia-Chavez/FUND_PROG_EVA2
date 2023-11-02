/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_9_switch;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA_2_9_SWITCH {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("indica el numero del mez");
        int mes = input.nextInt();
        
        switch(mes){
            
            case 1:
                System.out.println("ENERO");
                break;  
            case 2:
                System.out.println("FEBRERO");
                break;  
            case 3:
                System.out.println("MARZO");
                break;  
            case 4:
                System.out.println("ABRIL");
                break;  
            case 5:
                System.out.println("MAYO");
                break;  
            case 6:
                System.out.println("JUNIO");
                break;  
            case 7:
                System.out.println("JULIO");
                break;  
            case 8:
                System.out.println("AGOSO");
                break;  
            case 9:
                System.out.println("SEPTIEMBRE");
                break;  
            case 10:
                System.out.println("OCTUBRE");
                break;  
            case 11:
                System.out.println("NOBIEMBRE");
                break;  
            case 12:
                System.out.println("DICIEMBRE");
                break; 
            default:
                System.out.println("el numero "+mes+ " no es un mes valido!!!");
        }
        
    }
}
