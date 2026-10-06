import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeSepatu;
        int ukuran;
        int harga = 0;
        String kategori;

        System.out.print("Masukkan kode sepatu: ");
        kodeSepatu = input.nextInt();

        System.out.print("Masukkan kategori: ");
        kategori = input.next();

        System.out.print("Masukkan ukuran: ");
        ukuran = input.nextInt();

        if (kodeSepatu == 1) {
            if (kategori.equalsIgnoreCase("SlipOn")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            } else {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (kodeSepatu == 2) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (kodeSepatu == 3) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga == 0) {
            System.out.println("Data sepatu tidak valid");
        } else {
            System.out.println("Harga sepatu: Rp" + harga);
        }
    }
}