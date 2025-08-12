package Clase2;

import java.util.Scanner;

public class Calculadora_IMC {
    public static void main(String[] args) {
        /* EJERCICIO 1*/
        //Creacion del scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora IMC (Indice de masa corporal)");

        //Solicitud altura
        System.out.print("Ingrese su altura (expresada en metros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();//Limpieza de buffer

        //Solicitud peso
        System.out.print("Ingrese su peso (en kilogramos): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();//Limpieza de buffer

        //Calculo del IMC
        double imc = peso / (altura * altura);
        //Conversion tipo de dato
        int imcInt = (int) imc;

        //Imprimir resultado
        System.out.println("Su IMC es de: " + imcInt);
        System.out.println("Su IMC exacto es de: " + imc);
        if (imc <= 16) {
            System.out.println("Delgadez Severa");
        } else if (imc > 16 && imc < 17) {
            System.out.println("Delgadez Moderada");
        } else if (imc > 17 && imc < 18.5) {
            System.out.println("Delgadez Aceptable");
        } else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso Normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Obesidad Tipo I");
        } else if (imc > 35 && imc < 40) {
            System.out.println("Obesidad Tipo II");
        } else {
            System.out.println("Obesidad Tipo III");
        }

        scanner.close();//Cierre del scanner
    }
}
