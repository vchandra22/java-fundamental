import java.util.Scanner;

public class KonversiTanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tanggal, bulan, tahun;
        String namaBulan;

        tanggal = scanner.nextInt();
        bulan = scanner.nextInt();
        tahun = scanner.nextInt();

        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = ""; // Set namaBulan kosong jika bulan tidak valid
                break;
        }

        if (bulan >= 1 && bulan <= 12) {
            System.out.println(tanggal + " " + namaBulan + " " + tahun);
        } else {
            System.out.println("Input bulan tidak valid!");
        }

    }
}
