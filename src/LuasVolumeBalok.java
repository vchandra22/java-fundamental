import java.util.Scanner;

public class LuasVolumeBalok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int panjang, lebar, tinggi;
        int luasPermukaan, volume;

        panjang = scanner.nextInt();
        lebar = scanner.nextInt();
        tinggi = scanner.nextInt();

        luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        volume = panjang * lebar * tinggi;

        System.out.println(luasPermukaan);
        System.out.println(volume);
    }
}
