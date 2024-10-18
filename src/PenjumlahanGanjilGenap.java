import java.util.Scanner;

public class PenjumlahanGanjilGenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input;

        input = scan.nextInt();

        Integer Ganjil = 0;
        Integer Genap = 0;

        for (int i = 0; i < input ; i++) {
            if (i % 2 != 0) {
                Ganjil = Ganjil + i;

            }
        }




        int j = 0;
        int angka = 0;
        while(angka <= input){
            if(j % 2 == 0){
                Genap += j;
                angka++;
            }
            j++;
        }


        System.out.println(Ganjil);
        System.out.println(Genap);

    }
}