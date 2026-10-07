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
        int kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang pembayaran: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("total harga: " + diskon);
        System.out.println("total bayar: " + totalBayar);
        System.out.println("total diskon: " + diskon);

        totalBayar = totalHarga - diskon;

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian: " + kembalian);
        } else {
            kurang = uangBayar - totalBayar;
            System.out.println("kembalian: " + kurang);
        }

        input.close();
    }
}