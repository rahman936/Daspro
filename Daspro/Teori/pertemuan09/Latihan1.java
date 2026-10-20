import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalJam = 0;
        double jamBelajar;

        for (int hari = 1; hari <= 7; hari++) {
            do {
                System.out.print(
                    "Masukkan jam belajar hari ke-" + hari + ": "
                );
                jamBelajar = input.nextDouble();

                if (jamBelajar > 10) {
                    System.out.println(
                        "Jam belajar maksimal 10 jam. Masukkan ulang!"
                    );
                }

            } while (jamBelajar > 10);

            totalJam += jamBelajar;
        }

        System.out.println(
            "Total jam belajar selama seminggu: " + totalJam + " jam"
        );

        input.close();
    }
}