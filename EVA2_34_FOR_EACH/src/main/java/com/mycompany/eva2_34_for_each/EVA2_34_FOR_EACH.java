/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_34_for_each;

/**
 *
 * @author Alex
 */
public class EVA2_34_FOR_EACH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //FOR EACH --> FOR PARA RECORRER ARREGLOS
        //SOLO SIRVE PARA LEER ARREGLOS
        int arreglo[] = new int [10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
        System.out.println("");
        String mensaje[] = {"Hola"," ","Mundo"," ","Cruel!!!"};
        for (String valor : mensaje) {
            System.out.print(valor);
        }
    }
}
