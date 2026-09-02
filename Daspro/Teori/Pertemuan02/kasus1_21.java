import java.util.Scanner;

public class kasus1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang kebun: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar kebun: ");
        int lebar = input.nextInt();

        int keliling = 2 * (panjang + lebar);

        System.out.println("Keliling kebun = " + keliling + " meter");

        input.close();
    }
}