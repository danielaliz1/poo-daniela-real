package edu.daniela.real.actividades.actividad2.retos;

import java.util.Scanner;


public class SmallestNumber {

    public static void main(String[] args) {

    

        int number_1, number_2, number_3, number_4, number_5;
        int smallest;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Ingrese el primer número:");
        number_1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        number_2 = sc.nextInt();

        System.out.println("Ingrese el tercer número:");
        number_3 = sc.nextInt();

        System.out.println("Ingrese el cuarto número:");
        number_4 = sc.nextInt();

        System.out.println("Ingrese el quinto número:");
        number_5 = sc.nextInt();

        
        int[] numbers = {number_1, number_2, number_3, number_4, number_5};
        smallest = numbers[0];

        
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number; 
            }
        }

       
        System.out.println("El número más pequeño es: " + smallest);
        
        sc.close();

    }

  
}


