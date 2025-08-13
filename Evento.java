package Clase2;

import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        //Creacion del scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comparador de edad");
        System.out.print("Ingresa el nombre del primer usuario: ");
        String nom1 = scanner.nextLine();

        System.out.print("Ingresa el nombre del segundo usuario: ");
        String nom2 = scanner.nextLine();

        System.out.print(nom1 + " ingrese su edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();//Limpieza de buffer
        System.out.print(nom2 + " ingrese su edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();//Limpieza de buffer

        //Comparacion
        if (edad1 >= 18 && edad2 >= 18) {
            System.out.println(nom1 + " y " + nom2 + " son mayores de edad");
            if (edad1 < 30 && edad2 < 30) {
                System.out.println(nom1 + " y " + nom2 + " son menores de 30.");
            } else {
                if (edad1 < 30) {
                    System.out.println(nom1 + " es menor de 30.");
                }
                if (edad2 < 30) {
                    System.out.println(nom2 + " es menor de 30.");
                }
            }
            if (edad1 > 50 && edad2 > 50) {
                System.out.println(nom1 + " y " + nom2 + " son mayores de 50.");
            } else {
                if (edad1 > 50) {
                    System.out.println(nom1 + " tiene más de 50");
                }
                if (edad2 > 50) {
                    System.out.println(nom2 + " tiene más de 50");
                }
            }
        } else {
            System.out.println("Las personas son menores de edad.");
        }
    }//Cierre main
}//Cierre clase evento
