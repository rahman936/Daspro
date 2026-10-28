import java.util.Scanner;

public class Tugas3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1! Ulangi input.");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Toko " + i + " ---");

            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif! Ulangi input.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barangPelanggan;
                do {
                    System.out.print("  Jumlah barang Pelanggan " + j + ": ");
                    barangPelanggan = sc.nextInt();
                    if (barangPelanggan < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif! Ulangi input.");
                    }
                } while (barangPelanggan < 0);

                totalBarangToko += barangPelanggan;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n==============================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}