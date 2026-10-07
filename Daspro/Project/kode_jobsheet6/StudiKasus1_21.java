import java.util.Scanner;

public class StudiKasus1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahCup;
        int hargaPerCup = 18000;
        int totalHarga;
        int diskon;
        int totalBayar;
        int uangBayar;
        int kembalian;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang pembayaran: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;
        kembalian = uangBayar - totalBayar;

        System.out.println("Total harga = Rp" + totalHarga);
        System.out.println("Diskon = Rp" + diskon);
        System.out.println("Total bayar = Rp" + totalBayar);
        System.out.println("Kembalian = Rp" + kembalian);

        input.close();
    }
}