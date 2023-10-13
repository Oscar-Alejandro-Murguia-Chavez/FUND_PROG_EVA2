/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if2;

import java.util.*;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1;
        int valor2;
        
        System.out.println("Introduce el valor1");
        valor1 = input.nextInt();
        System.out.println("Introduce el valor2");
        valor2 = input.nextInt();
        
        if(valor1 > valor2){
            System.out.println("El valor mas grande es: " + valor1);
        }else{//cuando el resultado es falso
            if (valor1 == valor2) {
                System.out.println("Ambos valores son iguales");
            }else{
                System.out.println("El valor mas grande es: " + valor2);
            }
            
        }
        
    }
    
}
