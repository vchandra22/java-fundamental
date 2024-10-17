import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float phi = 3.14F;
        float jariJari, luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = (float) scanner.nextDouble();

        luas = phi * jariJari * jariJari;

        System.out.println(luas);
    }
}
