/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_operaciones;

/**
 *
 * @author alexl
 */
public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        
        //operador---> simbolo que ejecuta alguna accion         
        //suma ---> +
        int suma, val1, val2;
        val1=100;
        val2=200;
        
        suma = val1 + val2;
        
        System.out.println("SUMAN------------------");
        System.out.println("la suma es = "+suma); //concatenacion
        
        //RESTA --> -
        int resta;
        
        resta = val1 - val2;
        
        System.out.println("RESTA-----------------");
        System.out.println("La resta es = "+resta);
        
        //MULTIPLICACION-->*
        int multi;
        
        multi= val1*val2;
        
        System.out.println("MULTIPLICACION---------------");
        System.out.println("la multiplicaicon es = "+multi);
        
        //divicion --> /
        int divi;
        
        divi = val1/val2;
        
        System.out.println("DIVICION--------------");
        System.out.println("la divicion es = "+divi);
        
        val1=11;
        val2=2;
        divi=val1/val2;
        
        System.out.println("la divicion de 11/2 es = "+divi);
        int residuo= val1 % val2;
        
        System.out.println("el redicuo de 11/2 es = "+divi);
        
        //----
        double resu = val1 / val2;
        
        System.out.println("la divicion es = " +divi);
        
        double val1double=2;
        resu = val1 / val1double;
        
        System.out.println("la respuesta a la divicion es = "+resu);
        resu= 11/2.0;
        System.out.println("la divicion es = "+resu);
        
        //potencia
        double potencia = Math.pow(3, 3);
        
        System.out.println("potencia-------------");
        System.out.println("3 elevado a la 3 ="+potencia);
        
        //raiz
        double raiz = Math.pow(100, 0.5);
        
        System.out.println("raiz-------------------");
        System.out.println("la raiz cudrada de 100 = "+raiz);
        
        //ptrcedencia de operacions:
        int resu0p, x =3, y=2, z=5;
        
        resu0p=(x*z)+(x*y)/2-(y-z);
        
        System.out.println("el resultado es = "+resu0p);
        
        //formula general
        double resuform, a=3,b=9,c=3;
        
        resuform= (-(b)- Math.pow( ( (b * b)-(4* a * c)), 0.5)) / (2*a);
        
        System.out.println("resultado es = "+resuform);
        
    }
}
