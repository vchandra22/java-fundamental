import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka = scanner.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.println(i);
            }
        }
    }
}
