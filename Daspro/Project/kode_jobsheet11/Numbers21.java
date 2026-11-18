import java.util.Arrays;

public class Numbers21 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Kode 16
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Pertanyaan 2
        System.out.println(Arrays.toString(myNumbers));

        // Pertanyaan 3
        System.out.println(Arrays.deepToString(myNumbers));

        // Pertanyaan 5
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        // Pertanyaan 7
        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);

        // Diskusi 1: menyalin referensi
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);

        // Diskusi 2: clone() hanya shallow copy
        myNumbers[0][0] = 0;
        int[][] hasilClone = myNumbers.clone();
        hasilClone[0][0] = 99;
        System.out.println(myNumbers[0][0]);

        // Diskusi 3: deep copy
        myNumbers[0][0] = 0;
        int[][] deepCopy = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            deepCopy[i] = new int[myNumbers[i].length];
            for (int j = 0; j < myNumbers[i].length; j++) {
                deepCopy[i][j] = myNumbers[i][j];
            }
        }
        deepCopy[0][0] = 99;
        System.out.println(myNumbers[0][0]);
        System.out.println(deepCopy[0][0]);
    }
}