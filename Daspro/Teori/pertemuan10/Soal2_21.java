public class Soal2_21 {
    public static void main(String[] args) {
        char huruf = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}
