import java.util.Scanner;

public class Tugas2_BiayaCetak21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaCetakPerLembar = 500;
        int biayaJilid = 5000;
        int totalBayar;

        System.out.print("Masukkan Jumlah Lembar Dokumen: ");
        jumlahLembar = sc.nextInt();

        totalBayar = (jumlahLembar * biayaCetakPerLembar) + biayaJilid;

        System.out.println("-----------------------------------");
        System.out.println("Jumlah Lembar Dokumen     : " + jumlahLembar + " lembar");
        System.out.println("Total Biaya Harus Dibayar : Rp " + totalBayar);
        sc.close();
    }
}