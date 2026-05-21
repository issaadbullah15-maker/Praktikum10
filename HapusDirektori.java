package Modul10;

import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {

        var direktori = new File("direktori");

        if (direktori.exists() && direktori.isDirectory()) {

            File[] daftarFile = direktori.listFiles();

            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.delete()) {
                        System.out.println("File dihapus: " + file.getName());
                    } else {
                        System.err.println("Gagal menghapus file: " + file.getName());
                    }
                }
            }

            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus: " + direktori.getName());
            } else {
                System.err.println("Gagal menghapus direktori: " + direktori.getName());
            }

        } else {
            System.err.println("Direktori tidak ditemukan atau path bukan sebuah direktori.");
        }
    }
}