import java.util.Scanner;

public class TarifParkir21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = input.nextInt();
        int tarif;
        int parkir2jam = 2000;
        if (lamaParkir <= 2) {
            tarif = parkir2jam;
        } else {
            tarif = parkir2jam + (lamaParkir - 2) * 1000;
        }
        System.out.println("Tarif parkir: Rp " + tarif);
        input.close();

    }
}