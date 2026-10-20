import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomorPegawai = 1;
        double jamKerja;
        double gajiHarian;
        double bonus;

        for (;;) {
            System.out.print(
                    "Masukkan jam kerja pegawai ke-" + nomorPegawai
                            + " (negatif untuk berhenti): ");
            jamKerja = input.nextDouble();

            if (jamKerja < 0) {
                System.out.println("Program dihentikan.");
                break;
            }

            System.out.print("Masukkan gaji harian: ");
            gajiHarian = input.nextDouble();

            if (jamKerja > 8) {
                bonus = gajiHarian * 0.20;
            } else {
                bonus = 0;
            }

            System.out.println("Jam kerja: " + jamKerja + " jam");
            System.out.println("Gaji harian: " + gajiHarian);
            System.out.println("Bonus: " + bonus);
            System.out.println("------------------------");

            nomorPegawai++;
        }

        input.close();
    }
}