import java.util.Scanner;

public class tugas1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float gajiPokok = 5000000;
        byte jumlahAnak = 4;
        float tunjanganPerAnak = 100000;
        float persenPensiun = 0.10f;

        float totalTunjangan = jumlahAnak * tunjanganPerAnak;

        float potonganPensiun = gajiPokok * persenPensiun;

        float gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Total tunjangan anak = Rp " + totalTunjangan);
        System.out.println("Potongan dana pensiun = Rp " + potonganPensiun);
        System.out.println("Gaji bersih = Rp " + gajiBersih);

        input.close();
    }
}