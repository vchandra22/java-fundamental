import java.util.Scanner;

public class ExploreOperation {
    public static void main(String[] args) {
        /*
        * Operator
        * 1. Math operator (-, +, *, %, /)
        * 2. Comparison operator
        * 3. Logic
        * */

        int number1 = 100;
        int number2 = 200;
        int number3 = 300;

        int result = number1 + number2 * number3 % 9;
        System.out.println(result);
        float result2 = (float) number2 / number3; //casting (konversi)
        System.out.println(result2);
        System.out.println(number2 + number1);
        System.out.println(number2 - number1);

        //konversi menggunakan parsing
        String numberString = "123"; //harus angka agar bisa menggunakan parseShort string -> angka
        char numberChar = 'A'; //konversi ke ASCII
        short resultParsing = (short) numberChar;
        short resultShortParsing = Short.parseShort(numberString);
        System.out.println("Hasil parsing: " + resultParsing);
        System.out.println("Hasil parsing string: " + resultShortParsing);

        //concat
        String name = "Yuda";
        int age = 28;
        System.out.println("Nama: " + name + ", umur: " + age);
        System.out.println("2" + age);

        //increment & decrement
        age = age + 1;
        age++;
        System.out.println(age);
        System.out.println(age++); //masih 22
        System.out.println(age); //23
        System.out.println(++age); //

        age = age - 5;
        age -= 5;
        System.out.println(age);

        age *= 3;
        System.out.println(age);

        /*
        * Logic operator -> menghasilkan nilai boolean
        *
        * && -> kedua kondisi harus terpenuhi, salah satu tidak terpenuhi false
        * || -> kondisi salah satu terpenuhi, true
        *
        * true || false -> true
        * false || false -> false
        *
        * true && false -> false
        * true && true -> true
        *
        * */

        System.out.println("-".repeat(30));
        System.out.println(5 > 3 && 1 == 1);
        System.out.println((5 < 10 && 10 > 1) || 100 > 100);

        //inputan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1: ");
        String inputName = scanner.next();
        System.out.print("Input 2: ");
        String inputName2 = scanner.next();

        scanner.nextLine(); //menampung enter dari scanner diatasnya

        System.out.print("Input 3: ");
        String inputName3 = scanner.nextLine();
        System.out.print("Input 4: ");
        String inputName4 = scanner.next();

        System.out.println(inputName);
        System.out.println(inputName2);
        System.out.println(inputName3);
        System.out.println(inputName4);
    }
}
