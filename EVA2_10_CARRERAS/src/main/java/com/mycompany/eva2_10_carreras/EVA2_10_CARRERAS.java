/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA2_10_CARRERAS {

    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        String carrera;
        
        System.out.println("Ingresa las siglas (en MAYÚSCULAS) de tu Carrera: ");
        carrera=input.next();
        
    switch (carrera) {
        
        case "ISC":
            System.out.println("Ingeniería en Sistemas Computacionales");
            break;
            case "IINFO":
            System.out.println("Ingeniería en Informática");
            break;
            case "LA":
            System.out.println("Licenciatura en Administración");
            break;
            case "ARQ":
            System.out.println("Arquitectura");
            break;
            case "II":
            System.out.println("Ingeniería Industrial");
            break;
            case "IDI":
            System.out.println("Ingeniería en Diseño Industrial");
            break;
            case "IGE":
            System.out.println("Ingeniería en Gestión Empresarial");
            break;
        }            
    }
}
