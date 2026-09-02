import java.util.Scanner;

public class tugas2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte lebarTanah = 30;
        byte panjangTanah = 100;
        byte diameterKolam = 5;
        byte sisiTaman = 2;

        float phi = 3.14f;

        int luasTanah = lebarTanah * panjangTanah;

        float jariJari = diameterKolam / 2.0f;

        float luasKolam = phi * jariJari * jariJari;

        byte luasTaman = (byte) (sisiTaman * sisiTaman);

        float luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah = " + luasTanah + " m2");
        System.out.println("Luas kolam = " + luasKolam + " m2");
        System.out.println("Luas taman = " + luasTaman + " m2");
        System.out.println("Luas tanah yang tidak digunakan = "
                + luasTidakDigunakan + " m2");

        input.close();
    }
}