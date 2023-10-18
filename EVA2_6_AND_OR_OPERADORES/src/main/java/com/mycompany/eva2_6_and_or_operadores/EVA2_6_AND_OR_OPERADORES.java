/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_and_or_operadores;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_6_AND_OR_OPERADORES {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("ingresa la calificacion");        
        int califa = input.nextInt();
        
        //vamos a  evaluar
        if((califa >=0) && (califa<=100)){
            System.out.println("la calificacion "+califa+" es valida!!");
            if (califa>=70)
                System.out.println("acreditado");
            else
                System.out.println("no acreditado");
        }else
            System.out.println("la calificacion "+califa+" no es valida");
        
    }
}
