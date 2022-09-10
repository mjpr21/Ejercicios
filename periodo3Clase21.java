
package com.mycompany.p3;
import java.util.Scanner;
public class periodo3Clase21 {
    public static void main(String[] args) {
        Scanner objeto =new Scanner(System.in);
        int numero1 , numero2, respuesta, contador; 
        System.out.println("Ingrese el primer numero: ");
        numero1 =objeto.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 =objeto.nextInt ();
        contador =numero1;
        while (contador > numero2){
            System.out.println(contador);
            contador--;
        }    
    }
}
