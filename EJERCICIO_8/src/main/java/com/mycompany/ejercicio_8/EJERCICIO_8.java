/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_8;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EJERCICIO_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra = "";
        
        do{
        System.out.println("Introduce una letra");
        letra = input.nextLine();
        
        switch(letra){
            case "a":
                System.out.println("Es una vocal");
                break;
            case "A":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "E":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "I":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "O":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            case "U":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }
        }while(!letra.equals(""));
        
        
    }
}
