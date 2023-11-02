/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA2_20_WHILE_RETIROS {

    public static void main(String[] args) {
       
        int canti=1000;
        Scanner input=new Scanner(System.in);
        
        while(canti >0){
            
            System.out.println("cuanto desea retirar");
            int retiro = input.nextInt();
            //acmulador
            //canti = canti - retiro;
            canti-=retiro;
            System.out.println("te quedan $"+canti+" de saldo");
            
                
        }
    }
}
