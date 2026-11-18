import java.util.Scanner;

public class SurveiKepuasan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] data = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                data[i][j] = input.nextInt();
            }
        }

        System.out.println("\nRata-rata tiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total = total + data[i][j];
            }
            double rataResponden = (double) total / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }

        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total = total + data[i][j];
            }
            double rataPertanyaan = (double) total / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }

        int totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua = totalSemua + data[i][j];
            }
        }
        double rataKeseluruhan = (double) totalSemua / (10 * 6);
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);

        input.close();
    }
}