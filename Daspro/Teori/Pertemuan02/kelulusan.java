import java.util.Scanner;

public class kelulusan {
    public static void main(String[] args) {

        int nilai;
        int hadir;
        String status;

        Scanner sc = new Scanner(System.in);

        // Input Nilai
        System.out.println("Masukan Nilai : ");
        nilai = sc.nextInt();

        // Input Kehadiran
        System.out.println("Presentase Kehadiran : ");
        hadir = sc.nextInt();

        // Verifikasi Kondisi
        if (nilai >= 60 && hadir >= 80) {
            status = "Selamat anda Lulus";
            System.out.println("Status kelulusan anda : " + status);
        } else {
            status = "Maaf anda Tidak Lulus";
            System.out.println("Status kelulusan anda : " + status);
        }

        sc.close();
    }
}