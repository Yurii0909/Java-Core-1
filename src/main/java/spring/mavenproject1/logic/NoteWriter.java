package spring.mavenproject1.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoteWriter {
    public static void writeToFile(String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            writer.write(formattedTime + " -> " + note);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}