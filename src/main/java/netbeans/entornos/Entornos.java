/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package netbeans.entornos;

import java.util.Scanner;

/**
 *
 * @author vjtej
 */
public class Entornos {

    public static boolean validaEntrada(String entrada) {
        boolean valido = true;
        if (entrada.length() > 2) {
            valido = false;
        }
        if (!entrada.matches("[0-9]*")) {
            valido = false;
        }
        return valido;
    }

    public static void main(String[] args) {
        // declaracion variables

        int cuenta = 0;
        int producto = 0;
        //String obj;

        //recogida del numero por teclado
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 30: ");
        String numero = lectura.next();

        // validacion numero de que es numero y maximo dos cifras
        // System.out.println(validaEntrada(numero));
        if (validaEntrada(numero)) {
            int numeroreal = Integer.parseInt(numero);
            // validacion numero del 1 al 30
            if (numeroreal > 30 || numeroreal < 1) {
                System.out.println("No es un numero del 1 al 30");
            } else {
                System.out.println("Si es un numero del 1 al 30");

                //primer bucle
                System.out.println("PRIMERo CON BUCLE FOR HASTA 5");
                System.out.println("Tabla de multiplicar del " + numero);
                System.out.println(".............................. ");
                for (cuenta = 0; cuenta <= 5; cuenta++) {
                    producto = numeroreal * cuenta;
                    System.out.println(numeroreal + " X " + cuenta + " = " + producto);

                }

                //segundo bucle
                System.out.println("SEGUNDO CON BUCLE WHILE HASTA 8");
                System.out.println("Tabla de multiplicar del " + numero);
                System.out.println(".............................. ");
                while (cuenta <= 8) {
                    producto = numeroreal * cuenta;
                    System.out.println(numeroreal + " X " + cuenta + " = " + producto);
                    cuenta++;
                }
                //tercer bucle
                System.out.println("TERCER CON BUCLE DOWHILE HASTA 10");
                System.out.println("Tabla de multiplicar del " + numero);
                do {
                System.out.println(".............................. ");
                    producto = numeroreal * cuenta;
                    System.out.println(numeroreal + " X " + cuenta + " = " + producto);
                    cuenta++;
                } while (cuenta <= 10);
                //cuarto bucle
                System.out.println("TERCER CON BUCLE FORIN HASTA 10");
                System.out.println("Tabla de multiplicar del " + numero);
                System.out.println(".............................. ");
                int[] tabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                for (int operando : tabla) {
                    producto = numeroreal * operando;
                    System.out.println(numeroreal + " X " + operando + " = " + producto);
                }
            }
        } else {
            System.out.println("No es un numero o no es de dos cifras");
        }
    }

}
