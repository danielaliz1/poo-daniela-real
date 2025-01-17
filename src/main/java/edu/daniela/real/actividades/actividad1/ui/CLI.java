package edu.daniela.real.actividades.actividad1.ui;

import java.util.Scanner;

public class CLI {
    public static void ShowMenu() {
        System.out.println("1. Agregar carro al catalogo");
        System.out.println("2. Mostrar catalogo");
        System.out.println("3. Salir"); 

    
    }
    public void ShowMessage(String mensaje)
    {
        System.out.println(mensaje);
    }

    public void ShowError(String mensaje)
    {
        System.out.println("Error:" + mensaje);  
    }

    public void ShowStudent(String[] estudiantes)
    {
        for (String estudiante : estudiantes){
        System.out.println(estudiante);
    }
}

public static void runApp()
{
    ShowMenu();
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();
    while (opcion !=3) {
        switch (opcion) {
            case 1:
                System.out.println("Crear un nuevo estudiante");
                break;
            case 2: 
            System.out.println("Listar estudiantes");
                break;
            default:
            System.out.println("Opción invalida");
                break;
        }        
        ShowMenu();
        opcion = scanner.nextInt();
    }
}


}