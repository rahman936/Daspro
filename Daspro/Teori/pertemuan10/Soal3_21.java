public class Soal3_21 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");
            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    System.out.print(" + ");
                }
                System.out.print(i * i);
                jumlah += i * i;
            }
            if (n > 1) {
                System.out.print(" = " + jumlah);
            }
            System.out.println();
        }
    }
}
