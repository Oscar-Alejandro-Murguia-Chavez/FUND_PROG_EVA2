/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author alexl
 */
public class EVA2_12_CALIFAS_EUA {

    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("ingresa tu calificacion");
        int califa = input.nextInt();
        
        if((califa >=90) && (califa<=100))
            
            System.out.println("tu calificacion es: "+califa+"A");
            else if((califa >=80) && (califa<=89))
                System.out.println("tu calificacion es: "+califa+" B");
            else if((califa >=70) && (califa<=79))
                System.out.println("tu calificacion es: "+califa+" C");
            else if((califa >=60) && (califa<=60))
                System.out.println("tu calificacion es: "+califa+" D");
            else if((califa >=0) && (califa<60))
                System.out.println("tu calificacion es: "+califa+" F");
            else if(califa<0)
                System.out.println("tu calificacion no en valida "+califa);
            else if(califa>100)
                System.out.println("tu calificacion no en valida "+califa);    
    }
}
