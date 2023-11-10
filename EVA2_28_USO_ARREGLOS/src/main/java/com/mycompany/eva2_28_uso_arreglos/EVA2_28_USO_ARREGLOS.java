/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_28_uso_arreglos;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cant;
        int[] califas;//aqui no existe el arreglo
        
        System.out.println("Cuantas calificaciones quieres capturar?");
        cant = input.nextInt();
        //ya que sabemos cuantas califas necesitamos, creamos el arreglo
        califas = new int[cant];
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Introduce la calificacion:");
            califas[i] = input.nextInt();
        
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
        }
            
    }
}
