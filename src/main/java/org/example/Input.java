package org.example;

import java.io.File;
import java.util.Scanner;

public class Input {
    public static File input()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь до файла");

        String temp = scanner.nextLine();
        scanner.close();
        return new File(temp);
    }
}
