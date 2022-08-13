package com.company;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        System.out.println("Proporcina el titulo");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporcina el autor");
        var autor = consola.nextLine();
        System.out.println( titulo + " fue escrito por "+autor);

    }
}
