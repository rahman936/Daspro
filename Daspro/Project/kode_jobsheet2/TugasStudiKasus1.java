public class TugasStudiKasus1 {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        byte jumlahAnak = 4;
        int tunjanganPerAnak = 100000;

        int totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji Bersih Pak Danur: Rp " + gajiBersih);
    }
}