package Modul10;

import java.io.File;

public class DaftarFileDirektori {
    public static void main(String[] args) {
  
        var direktori = new File(".");

        File[] isiDirektori = direktori.listFiles();

        if (isiDirektori != null) {
            System.out.println("Daftar file di dalam direktori:");

            for (File file : isiDirektori) {
                if (file.isFile()) {
                    System.out.println("- " + file.getName());
                }
            }
        } else {
            System.err.println("Path yang diberikan bukan sebuah direktori yang valid.");
        }
    }
}