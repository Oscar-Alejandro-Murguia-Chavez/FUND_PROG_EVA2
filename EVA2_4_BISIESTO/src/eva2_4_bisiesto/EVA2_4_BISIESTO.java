/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_bisiesto;

import java.util.*;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int year;
        int residuo;
        
        System.out.println("Introduce un año");
        year = input.nextInt();
        

        residuo = year % 4;
        
        if (residuo == 0) {
            
            residuo = year % 100;
            if (residuo == 0) {
                
                residuo = year % 400;
                if (residuo == 0) {
                    System.out.println("Si es bisiesto");
                }else{
                    System.out.println("No es bisiesto");
                }
                
            }else{
                System.out.println("Si es bisiesto");
            }
                  
        }else{
            System.out.println("No es bisiesto");
        }
        
        
    }
    
}
