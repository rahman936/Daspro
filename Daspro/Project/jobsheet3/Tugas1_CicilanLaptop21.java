import java.util.Scanner;

public class Tugas1_CicilanLaptop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka, sisaHarga;
        int lamaCicilan;
        double pokokCicilan, bungaBulan, cicilanPerBulan;

        System.out.print("Masukkan Harga Laptop (Rp): ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukkan Uang Muka / DP (Rp): ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan Lama Cicilan (Bulan): ");
        lamaCicilan = sc.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        pokokCicilan = sisaHarga / lamaCicilan;
        bungaBulan = 0.02 * sisaHarga;
        cicilanPerBulan = pokokCicilan + bungaBulan;

        System.out.println("-----------------------------------");
        System.out.println("Sisa Pokok Pinjaman : Rp " + sisaHarga);
        System.out.println("Cicilan per Bulan   : Rp " + cicilanPerBulan);
        sc.close();
    }
}