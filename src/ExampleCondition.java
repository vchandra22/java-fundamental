import java.util.Scanner;

public class ExampleCondition {
    public static void main(String[] args) {
        /*
        * Condition = true / false
        * IF - ELSE
        * statement = baris kode yang akan dieksekusi ketika kondisi terpenuhi
        *
        * if(){
        *   statement
        * }
        * */

        Scanner scanner = new Scanner(System.in);

        if (!true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String username, password;

        System.out.print("Input username: ");
        username = scanner.nextLine();
        System.out.print("Input password: ");
        password = scanner.nextLine();

        boolean isAuthenticate = (username.equals("admin") && password.equals("password"));

        if (isAuthenticate){
            System.out.println("login berhasil");
        } else {
            System.out.println("login gagal");
        }

        System.out.print("Input umur: ");
        int umur = Integer.parseInt(scanner.nextLine());
        System.out.print("Input role: ");
        String role = scanner.nextLine();

        String ternaryUmur = (umur == 17) ? "berhasil" : "gagal";
        System.out.println(ternaryUmur);
        String ternaryRole = (role.equalsIgnoreCase("admin")) ? "Ok" : "Tidak Ok";
        System.out.println(ternaryRole);

        //ternary menggunakan AND bersamaan
        String ternaryAnd = (umur == 17) && (role.equalsIgnoreCase("admin")) ? "berhasil" : "gagal";
        System.out.println(ternaryAnd);

        char grade;
        System.out.println("Input grade: ");
        grade = Character.toLowerCase(scanner.next().charAt(0));

        scanner.nextLine();

        switch (grade) {
            case 'a':
                System.out.println("Excellent");
                break; //biar berhenti
                case 'b':
                    System.out.println("Good");
                    break;
                    case 'c':
                        System.out.println("Poor");
                        break;
                        case 'd':
                            System.out.println("Bad");
                            break;
                            case 'e':
                                System.out.println("Salah jurusan");
                            default:
                                System.out.println("Not a valid grade");
        }

        //cek bilangan ganjil atau genap
        int angka;

        System.out.println("Input angka: ");
        angka = Integer.parseInt(scanner.nextLine());

        String cekBilangan = (angka %2 == 0) ? "genap" : "ganjil";
        System.out.println(cekBilangan);

    }
}
