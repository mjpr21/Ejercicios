package com.mycompany.periodo1clase8;
import java.util.Scanner;
public class Periodo1clase8 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        
        int numero1; //declaracion de variable, primer numero a sumar 
        int numero2; //declaracion de variable, segundo numero a sumar
        int suma; // declaracion de variable, suma numero1 y numero2
        
        System.out.print ( " Escriba el primer entero : " ) ; // indicador 
        int numerol = entrada.nextInt (); // lee el primer número del usuario 
        
        System.out.print ( " Escriba el segundo entero : " ) ; // indicador 
        numero2 = entrada.nextInt () ; // lee el segundo número del usuario
        
        suma = numerol + numero2 ; // suma los números , después almacena el total en suma
        
        System.out.println ( " La suma és " + suma ) ; // muestra là sumā 
        }
    }
