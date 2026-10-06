import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku;
        int jumlah;
        double diskon;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlah = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;

            if (jumlah > 2) {
                diskon = diskon + 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;

            if (jumlah > 3) {
                diskon = diskon + 2;
            } else {
                diskon = diskon + 1;
            }
        } else {
            diskon = 5;

            if (jumlah <= 3) {
                diskon = 0;
            }
        }

        System.out.println("Diskon: " + diskon + "%");
    }
}