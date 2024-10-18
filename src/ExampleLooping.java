import java.util.Scanner;

public class ExampleLooping {
    public static void main(String[] args)
    {
        /*
         * Iteration
         * 1. For
         * for(inisialisasi; kondisi; increment/decrement) {
         *   statement
         *
         * 2. Do-while
         * do{
         *  statement
         * } while (condition);
         * }
         * */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //melompati 5
                // break;
            }
            System.out.println(i);
        }

        int i = 0;

        while (i < 10) {
            System.out.print(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        Scanner scanner = new Scanner(System.in);

        String nama;

        do {
            System.out.println("Masukkan nama (min 4 karakter): ");
            nama = scanner.nextLine();
        } while (nama.length() < 4);
        System.out.println("Nama saya: " + nama);

        int choice; //variable untuk terima inputan menu

        do {
            //menammpilkan menu
            System.out.println("Menu: ");
            System.out.println("1. menu satu");
            System.out.println("2. menu dua");
            System.out.println("3. keluar");

            //mendapatkan inputan user
            choice = Integer.parseInt(scanner.nextLine()); //casting


            switch (choice){
                case 1:
                    System.out.println("ini menu satu");
                    break;
                    case 2:
                        System.out.println("ini menu dua");
                        break;
                        case 3:
                            break;
                default:
                    System.out.println("invalid");
            }
        } while (choice !=3);

        int n;
        System.out.println("input ukuran: ");
        n = scanner.nextInt();

        for(i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
