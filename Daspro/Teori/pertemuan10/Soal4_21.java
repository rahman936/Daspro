import java.util.Scanner;

public class Soal4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlProduk;
        int jmlHari;

        do {
            System.out.print("Jumlah produk: ");
            jmlProduk = sc.nextInt();
        } while (jmlProduk < 1);

        do {
            System.out.print("Jumlah hari: ");
            jmlHari = sc.nextInt();
        } while (jmlHari < 1);

        int totalSemua = 0;
        int p = 1;
        while (p <= jmlProduk) {
            int totalProduk = 0;
            System.out.println("Produk " + p);
            for (int h = 1; h <= jmlHari; h++) {
                int jumlah;
                do {
                    System.out.print("  Hari " + h + ": ");
                    jumlah = sc.nextInt();
                } while (jumlah < 0);
                totalProduk += jumlah;
            }
            double rata = (double) totalProduk / jmlHari;
            System.out.println("Total produk " + p + " = " + totalProduk);
            System.out.println("Rata-rata harian produk " + p + " = " + rata);
            totalSemua += totalProduk;
            p++;
        }
        System.out.println("Total semua produk = " + totalSemua);
    }
}
