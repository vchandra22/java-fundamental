import java.util.Scanner;

public class CekJam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jam = scanner.nextInt();

        if (jam < 0 || jam > 24) {
            System.out.println("WAKTU HANYA 24 JAM");
        }
        // Cek apakah jam adalah jam belajar
        else if ((jam >= 8 && jam <= 12) || (jam >= 14 && jam <= 17)) {
            System.out.println("JAM BELAJAR");
        }
        // Selain itu, adalah jam istirahat
        else {
            System.out.println("JAM ISTIRAHAT");
        }
    }
}
