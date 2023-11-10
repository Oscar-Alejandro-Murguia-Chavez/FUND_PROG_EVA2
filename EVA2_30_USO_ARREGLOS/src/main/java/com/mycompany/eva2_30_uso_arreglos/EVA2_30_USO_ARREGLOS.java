/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_30_uso_arreglos;

import java.util.*;

/**
 *
 * @author alexl
 */
public class EVA2_30_USO_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opc, cant;
        String[] listaFood = new String[10];
        listaFood[0] = "Tacos";
        listaFood[1] = "Tortas";
        listaFood[2] = "Tamales";
        listaFood[3] = "Tlacoyos";
        listaFood[4] = "Tlayudas";
        listaFood[5] = "Tampiqueñas";
        listaFood[6] = "Tortas ahogadas";
        listaFood[7] = "Tchilaquiles";
        listaFood[8] = "T-Bone";
        listaFood[9] = "Tripas";


        double[] listPrecios = {20,40,15,50,30,54,60,200,400,10};

        System.out.println("---------Menú-----------");
        for (int i = 0; i < listaFood.length; i++) {
            System.out.println(i + "- " + listaFood[i] + ": $" + listPrecios[i]);
        }

        System.out.println("¿Que deseas ordenar?");
        opc = input.nextInt();

        System.out.println("¿Cuantas ordenes?");
        cant = input.nextInt();
        System.out.println("Tu total es de: $" + (cant * listPrecios[opc]));
    }
}
