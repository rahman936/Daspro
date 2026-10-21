import java.util.Scanner;

public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlah, totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop (input 0 untuk selesai) ===");
        while (true) {
            System.out.print("Jumlah tiket yang dibeli: ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            double diskon = 0;
            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            double harga = jumlah * HARGA_TIKET;
            double bayar = harga - (harga * diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar pelanggan: Rp " + (int) bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + (int) totalPenjualan);
    }
}
