/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_promedio_califas;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_15_PROMEDIO_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cuántas calificaciones va a capturar?: ");
        int cali = input.nextInt();
        
        int sumacali=0;
        
        //Acumulador
        for (int i = 1; i <= cali; i++) {
            System.out.println("Ingrese la calificación:");
            int cali1 = input.nextInt();
            sumacali= sumacali + cali1;
        }
       
        System.out.println("LA SUMATORIA = "+ sumacali);
        //SI el divisor es entero, el resultado será entero
        double prom= sumacali/(cali*1.0);
        
    
        System.out.println("El promedio de sus califiaciones es de: "+ prom);
    
    }
}
