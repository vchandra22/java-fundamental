import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        int age;
        String hobby;
        char grade;

        System.out.print("Input first name: ");
        firstName = scanner.nextLine();
        System.out.print("Input last name: ");
        lastName = scanner.nextLine();
        System.out.print("Input umur: ");
        // scanner.nextLine(); //menampung enter dari nextLine

        age = Integer.parseInt(scanner.nextLine()); //cara lain menggunakan metode parsing

        System.out.print("Input hobby: ");
        hobby = scanner.nextLine();
        System.out.print("input grade: ");
        grade = scanner.next().charAt(0);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(hobby);
        System.out.println(grade);


        //program inputan untuk biodata
        //nama, umur, hobi, alamat

        String nama;
        int umur;
        String hobi;
        String alamat;

        scanner.nextLine(); //menampung enter dari nextLine grade (sebelumnya)

        System.out.print("Input nama: ");
        nama = scanner.nextLine();
        System.out.print("Input umur: ");
        umur = Integer.parseInt(scanner.nextLine());
        System.out.print("Input hobi: ");
        hobi = scanner.nextLine();
        System.out.print("Input alamat: ");
        alamat = scanner.nextLine();

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(hobi);
        System.out.println(alamat);

    }
}
