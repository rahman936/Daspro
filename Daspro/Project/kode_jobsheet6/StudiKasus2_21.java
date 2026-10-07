import java.util.Scanner;

public class StudiKasus2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkat;
        int statusPendanaan;
        int kurangDokumen;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Jumlah dokumen yang diupload (0-4): ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana penghargaan: Berhak memperoleh dana penghargaan.");
                    System.out.println("Alasan: Juara " + peringkat
                            + " dan dokumen lengkap.");
                } else {
                    kurangDokumen = 4 - jumlahDokumen;

                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana penghargaan: Dana penghargaan tidak diberikan.");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Jumlah dokumen yang masih kurang: "
                            + kurangDokumen);
                }

            } else {
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status dana penghargaan: Dana penghargaan tidak diberikan.");
                System.out.println("Alasan: Hanya Juara 1, 2, atau 3 yang memperoleh dana.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen yang diupload (0-4): ");
            jumlahDokumen = input.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = input.nextInt();

            if (statusPendanaan == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana penghargaan: Berhak memperoleh dana penghargaan.");
                    System.out.println("Alasan: PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    kurangDokumen = 4 - jumlahDokumen;

                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana penghargaan: Dana penghargaan tidak diberikan.");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Jumlah dokumen yang masih kurang: "
                            + kurangDokumen);
                }

            } else {
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status dana penghargaan: Dana penghargaan tidak diberikan.");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }

        } else {
            System.out.println("Nama mahasiswa: " + nama);
            System.out.println("Status dana penghargaan: Dana penghargaan tidak diberikan.");
            System.out.println("Alasan: Jenis kegiatan tidak termasuk ketentuan.");
        }

        input.close();
    }
}