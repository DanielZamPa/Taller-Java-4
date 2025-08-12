package Clase2;
import java.util.Scanner;

public class Edades {
    public static void main(String[] args){
        //Creacion del scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comparador de edad");
        System.out.print("Ingresa el nombre del primer usuario: ");
        String nom1 = scanner.next();

        System.out.print("Ingresa el nombre del segundo usuario: ");
        String nom2 = scanner.next();

        System.out.print(nom1 +" ingrese su edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();//Limpieza de buffer
        System.out.print(nom2 +" ingrese su edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();//Limpieza de buffer

        //Comparacion
        if (edad1<edad2){
            System.out.println(nom2+" es mayor que "+nom1);
        }else if (edad1>edad2){
            System.out.println(nom1+" es mayor que "+nom2);
        }else {
            System.out.println("Ambos tienen la misma edad");
        }
        scanner.close();

    }//Final clase main
}//Cierre clase operadores
