import java.util.Scanner;

public class Survei21 {
    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        // Input jawaban 1 sampai 5
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);
                survei[i][j] = jawaban;
            }
        }

        System.out.println("\nRata-rata setiap responden:");
        double totalSemua = 0;
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += survei[i][j];
            }
            totalSemua += totalResponden;
            System.out.printf("Responden %d: %.2f%n", (i + 1), totalResponden / JUMLAH_PERTANYAAN);
        }

        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += survei[i][j];
            }
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), totalPertanyaan / JUMLAH_RESPONDEN);
        }

        System.out.printf("%nRata-rata keseluruhan: %.2f%n", totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN));
        sc.close();
    }
}