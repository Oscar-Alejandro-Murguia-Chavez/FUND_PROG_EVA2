/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclo_for;

/**
 *
 * @author alexl
 */
public class EVA2_14_CICLO_FOR {

    public static void main(String[] args) {
        // TODO code application logic here
        //for-->desde
        //se ejecunta desde un punto hasta otro
        // for  (punto de incio);conidición para el término; manera de avanzar(o retroceder)
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);    
        }
        
        System.out.print("---------------");
        for(int i=9; i >=0; i--){
            System.out.println(i);
        }
        
        //-------------------------
        //NUMEROS PARES DE 0 A 100
        for(int i=0; i<=100;i+=2)
            System.out.print(i+"-");
    }
}
