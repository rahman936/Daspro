public class TugasStudiKasus2 {
    public static void main(String[] args) {
        double lebarTanah = 30;
        double panjangTanah = 100;
        double diameterKolam = 5;
        double sisiTaman = 2;

        double luasTanah = lebarTanah * panjangTanah;

        double jariJariKolam = diameterKolam / 2;
        double luasKolam = Math.PI * Math.pow(jariJariKolam, 2);
        double luasTaman = sisiTaman * sisiTaman;

        double sisaTanah = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan: " + sisaTanah + " m^2");
    }
}
