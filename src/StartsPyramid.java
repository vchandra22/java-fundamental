import java.util.Scanner;

public class StartsPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        int i =0;
        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < n);

        i = n - 1;

        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < i);
            System.out.println();
            i--;
        } while (i > 0);

        for (i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
