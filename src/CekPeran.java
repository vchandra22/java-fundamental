import java.util.Scanner;

public class CekPeran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, peran;

        // Input nama dan peran
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan peran: ");
        peran = scanner.nextLine();

        // Cek apakah nama dan peran kosong
        if (nama.isEmpty() && peran.isEmpty()) {
            System.out.println("Nama dan Peran Harus Di Isi");
        } else if (!nama.isEmpty() && peran.isEmpty()) {
            System.out.println("Peran Harus Di Isi");
        } else if (!nama.isEmpty() && peran.equalsIgnoreCase("Superhero")) {
            System.out.println("Selamat Datang Superhero " + nama + ", Kalahkan Semua Monster Di Muka Bumi");
        } else if (!nama.isEmpty() && peran.equalsIgnoreCase("Monster")) {
            System.out.println("Selamat Datang Monster " + nama + ", Hancurkan Semua Superhero Yang Ada");
        } else if (!nama.isEmpty()) {
            System.out.println("Selamat Datang " + nama + ", Pilih Peranmu Untuk Melanjutkan Game Ini");
        }
    }
}