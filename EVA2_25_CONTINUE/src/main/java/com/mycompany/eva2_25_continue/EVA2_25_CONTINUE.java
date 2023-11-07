/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_continue;

/**
 *
 * @author alexl
 */
public class EVA2_25_CONTINUE {

    public static void main(String[] args) {    
        // TODO code application logic here
        //continue --> salta todo lo que sigue de la iteracion y la repite
        for (int i = 1; i <= 15; i++) {
            if(i == 5)
                continue;
            System.out.print(i + "-");
        }
        
        System.out.println("");
        //break --> detiene por completo la iteracion
        for (int i = 1; i <= 15; i++) {
            if(i == 5)
                break;
            System.out.print(i + "-");
        }
        
        System.out.println("");
        for (int i = 1; i <= 20; i++) {
            if((i%2) != 0)
                continue;
            System.out.print(i + "-");
        }
    }
}
