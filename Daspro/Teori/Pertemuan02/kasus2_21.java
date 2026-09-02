import java.util.Scanner;

public class kasus2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prosentaseBunga = 0.02;

        System.out.print("Masukkan jumlah tabungan awal: Rp ");
        double jumlahTabunganAwal = input.nextDouble();

        double jumlahTabunganAkhir = jumlahTabunganAwal;

        jumlahTabunganAkhir = jumlahTabunganAkhir * (1 + prosentaseBunga);
        jumlahTabunganAkhir = jumlahTabunganAkhir * (1 + prosentaseBunga);
        jumlahTabunganAkhir = jumlahTabunganAkhir * (1 + prosentaseBunga);
        jumlahTabunganAkhir = jumlahTabunganAkhir * (1 + prosentaseBunga);
        jumlahTabunganAkhir = jumlahTabunganAkhir * (1 + prosentaseBunga);

        double bunga = jumlahTabunganAkhir - jumlahTabunganAwal;

        System.out.println("Bunga = Rp " + bunga);
        System.out.println("Jumlah tabungan akhir selama 5 tahun = Rp " + jumlahTabunganAkhir);

        input.close();
    }
}