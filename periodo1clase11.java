
package com.mycompany.periodo1clase8;
import java.util.Scanner;
public class periodo1clase11 {
    Scanner Entrada = new Scanner (System.in);
       float nota1, nota2, nota3, promedio;
       nota1 = Entrada.nextFloat();
       System.out.println ("Ingrese la primera nota");
       nota1 = Entrada.nextFloat();
       System.out.println ("Ingrese la primera nota");
       nota2 = Entrada.nextFloat();
       System.out.println ("Ingrese la primera nota");
       nota3 = Entrada.nextFloat();
       promedio = (nota1 + nota2 + nota3) /3;
       System.out.println ("El promedio es: " + promedio);
       if (promedio >=7) {
       System.out.println ("promocionado");  
       } else if (promedio >= 4) {
       System.out.println ("Regular");
       } else {
       System.out.println ("Reprobado");    
           
       }
       
    }

