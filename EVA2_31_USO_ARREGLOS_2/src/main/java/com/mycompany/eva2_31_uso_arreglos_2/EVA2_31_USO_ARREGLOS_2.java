/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_31_uso_arreglos_2;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_31_USO_ARREGLOS_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        //GENERAR ARREGLO TAMAÑO 15
        //LLENARLO CON VALORES ALEATORIOS: 0 Y 99
        Scanner input = new Scanner(System.in);
        int valor;
        int posi = -1;
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("¿Que valor necesitas?");
        valor = input.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i] == valor){
                   posi = i;
                   System.out.println("Valor encontrado en: " + i);
                   break;
                }
                if(i == (arreglo.length - 1))
                    System.out.println("No esta!!");

        }
    }
}
