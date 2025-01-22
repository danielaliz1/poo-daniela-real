package edu.daniela.real.actividades.actividad2.retos;

    import java.util.HashSet;
    import java.util.Scanner;    
    
    public class DuplicatedLetter {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Escribe una palabra: ");
                String word = scanner.nextLine();
    
                word = word.toLowerCase();
                HashSet<Character> processedLetters = new HashSet<>();
    
                for (int i = 0; i < word.length(); i++) {
                    char letter = word.charAt(i);
    
                    if (processedLetters.contains(letter)) {
                        continue;
                    }
    
                    int contador = 0;
    
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) == letter) {
                            contador++;
                        }
                    }
    
                    if (contador > 1) {
                        System.out.print("La '" + letter + "' se repite en la posicion: ");
                        for (int j = 0; j < word.length(); j++) {
                            if (word.charAt(j) == letter) {
                                System.out.print(j + " ");
                            }
                        }
                        System.out.println();
                    }
    
                    processedLetters.add(letter);
                }
            }
        }
    }

