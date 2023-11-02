/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA2_13_TALLAS {

    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        System.out.println("ingresa tu talla");
        int talla = input.nextInt();
        
        switch(talla){
            
            case 29:
                System.out.println("tu talla es small");
                break;
            case 42:
                System.out.println("tu talla es medium");
                break;
            case 44:
                System.out.println("tu talla es large");
                break;
            case 48:
                System.out.println("tu talla es xlarge");
                break;
            default:
                System.out.println("tu talla es desconocida "+talla);
        }
    }
}
