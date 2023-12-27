/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package spring.mavenproject1;

/**
 *
 * @author ACER
 */




import spring.mavenproject1.logic.NoteWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();
        NoteWriter.writeToFile(note);
        System.out.println("Заметка успешно сохранена в файл.");
    }
}
