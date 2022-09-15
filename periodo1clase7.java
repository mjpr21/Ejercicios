
package com.mycompany.periodo1clase8;
import java.util.Scanner;
public class periodo1clase7 {
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese Nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese clave de usuario: ");
        clave= entrada.nextLine();
        if (nombre.equals("Juan") && clave.equals("123456")) {
            System.out.println("Bienvenido al Sistema") ;
        }
        else {
            System.out.println("Nombre de usuario o contraseña incorrecto");
        }
    }
}
