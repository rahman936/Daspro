import java.util.Scanner;

public class MesinAntrian21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = input.nextInt();
        String layanan;
        String loket;
        if (kode == 1) {
            layanan = "Legalisir Ijazah";
            loket = "Loket A";
        } else if (kode == 2) {
            layanan = "Surat Keterangan Aktif Kuliah";
            loket = "Loket B";
        } else if (kode == 3) {
            layanan = "Pembayaran UKT";
            loket = "Loket C";
        } else if (kode == 4) {
            layanan = "Pengajuan Cuti Akademik";
            loket = "Loket D";
        } else {
            layanan = "Kode tidak valid";
            loket = "-";
        }
        System.out.println("Layanan: " + layanan);
        System.out.println("Loket: " + loket);
        input.close();
    }
}
