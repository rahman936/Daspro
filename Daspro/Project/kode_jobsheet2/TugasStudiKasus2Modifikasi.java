import java.util.Scanner;

public class TugasStudiKasus2Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Lebar Tanah (m): ");
        double lebarTanah = sc.nextDouble();

        System.out.print("Masukkan Panjang Tanah (m): ");
        double panjangTanah = sc.nextDouble();

        System.out.print("Masukkan Diameter Kolam (m): ");
        double diameterKolam = sc.nextDouble();

        System.out.print("Masukkan Panjang Sisi Taman Bunga (m): ");
        double sisiTaman = sc.nextDouble();

        double luasTanah = lebarTanah * panjangTanah;
        double jariJariKolam = diameterKolam / 2;
        double luasKolam = Math.PI * Math.pow(jariJariKolam, 2);
        double luasTaman = sisiTaman * sisiTaman;

        double sisaTanah = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan: " + sisaTanah + " m^2");

        sc.close();
    }
}
