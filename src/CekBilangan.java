import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka;

        System.out.println("Input angka: ");
        angka = Integer.parseInt(scanner.nextLine());

        String cekBilangan = (angka %2 == 0) ? "genap" : "ganjil";
        System.out.println(cekBilangan);
    }
}
