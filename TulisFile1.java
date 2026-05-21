package Modul10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();
        var file = new File("src/Modul10/test.txt");
        try (var writer = new FileWriter(file, false)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        keyboard.close();
    }
}