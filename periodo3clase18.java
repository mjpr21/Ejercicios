
package com.mycompany.mavenproject1;
import java.util.Scanner;
public class periodo3clase18 {
    public static  void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        int i= 1;
        int potencia;
        int base;
        int calculo =1;
        System.out.println("Introduzca el valor de a base: ");
        base = teclado.nextInt();
        System.out.print("Introduzca el valor del exponente: ");
        potencia =teclado.nextInt();
        while (i<potencia) {
            calculo = calculo * base;
            i ++;
        }
        System.out.println("El resultado del calculo de la potencia es: ");
    }
}
