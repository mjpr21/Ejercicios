
package com.mycompany.periodo2clase4;
import java.util.Scanner;
public class Periodo2clase8 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingresar el numero:");
        int numero;
        numero = ingresar.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(numero + "*" + i + " = " + numero * i);
        }
    }
}    
