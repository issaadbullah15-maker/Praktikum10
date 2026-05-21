package Modul10;

import java.io.File;

public class CekUkuranFile {
    public static void main(String[] args) {
 
        var file = new File("test.txt");

        if (file.exists()) {
            double bytes = file.length();

            double kilobytes = bytes / 1024;
            double megabytes = kilobytes / 1024;

            if (megabytes < 1) {
                System.out.printf("Ukuran file: %.2f KB%n", kilobytes);
            } else {
                System.out.printf("Ukuran file: %.2f MB%n", megabytes);
            }
        } else {
            System.err.println("File tidak ditemukan!");
        }
    }
}