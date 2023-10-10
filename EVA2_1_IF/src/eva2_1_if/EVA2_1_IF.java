/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.*;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int califa;
        
        System.out.println("Introduce tu calificacion");
        califa = input.nextInt();
                
        if (califa>=70) //if(expresion a evaluar)
        {
            System.out.println("Aprobado: Viaje a cancun!!!");
            System.out.println("FELICIDADES!!!");
        }else{
        System.out.println("No acreditada: A repetir materia");
        }
         System.out.println("FIN DEL PROGRAMA");
        
    }
    
}
