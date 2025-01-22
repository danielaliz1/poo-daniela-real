package edu.daniela.real.actividades.actividad2.retos;

public class StringReversal {


        public static String reverseInputString(String myString) {
    
            if (myString == null)
              return null;
    
    
              return new StringBuilder(myString).reverse().toString();
        }
    
        public static void main(String[] args) {
    
            String myString1 = "Hola Mundo!";
            System.out.println("reverse(" + myString1 + ") = " + reverseInputString(myString1));
        }
    
    }
