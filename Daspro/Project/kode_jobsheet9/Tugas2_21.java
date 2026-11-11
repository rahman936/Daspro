import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("=== KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        // Fitur pencarian menu (linear search)
        System.out.print("\nCari menu: ");
        String cari = input.nextLine().trim();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println(menu[i] + " tersedia, harga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        // Fitur pemesanan
        System.out.print("\nJumlah item yang ingin dipesan: ");
        int jumlah = Integer.parseInt(input.nextLine().trim());

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int indeks = -1;
            while (indeks == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String nama = input.nextLine().trim();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        indeks = j;
                        break;
                    }
                }
                if (indeks == -1) {
                    System.out.println("Menu tidak tersedia, silakan coba lagi.");
                }
            }
            pesanan[i] = menu[indeks];
            hargaPesanan[i] = harga[indeks];
            total += harga[indeks];
        }

        // Tampilkan daftar pesanan dan total
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %-16s Rp %d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Total biaya: Rp " + total);
    }
}