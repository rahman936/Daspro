import java.util.Scanner;

public class TugasStudiKasus1Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: Rp ");
        int gajiPokok = sc.nextInt();

        System.out.print("Masukkan Jumlah Anak: ");
        byte jumlahAnak = sc.nextByte();

        System.out.print("Masukkan Tunjangan per Anak: Rp ");
        int tunjanganPerAnak = sc.nextInt();

        int totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Total Gaji Bersih: Rp " + gajiBersih);

        sc.close();
    }
}
