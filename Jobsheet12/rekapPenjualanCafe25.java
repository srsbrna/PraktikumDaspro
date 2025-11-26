import java.util.Scanner;

public class rekapPenjualanCafe25 {
    static final int JUMLAH_MENU = 5;
    static final int JUMLAH_HARI = 7;
    static String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar"};

    // Fungsi input data penjualan
    public static void inputData(int[][] penjualan, Scanner sc) {
        for (int hari = 0; hari < JUMLAH_HARI; hari++) {
            System.out.println(" Hari ke-" + (hari + 1));
            for (int menu = 0; menu < JUMLAH_MENU; menu++) {
                System.out.print("   Jumlah penjualan " + namaMenu[menu] + ": ");
                penjualan[hari][menu] = sc.nextInt();
            }
        }
    }

    // Fungsi tampilkan tabel penjualan
    public static void tampilkanTabel(int[][] penjualan) {
        System.out.println("\nRekap Penjualan 7 Hari:");
        System.out.printf("%-15s", "Menu/Hari");
        for (int hari = 1; hari <= JUMLAH_HARI; hari++) {
            System.out.printf("%-8s", "H" + hari);
        }
        System.out.println();

        for (int menu = 0; menu < JUMLAH_MENU; menu++) {
            System.out.printf("%-15s", namaMenu[menu]);
            for (int hari = 0; hari < JUMLAH_HARI; hari++) {
                System.out.printf("%-8d", penjualan[hari][menu]);
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu dengan penjualan tertinggi
    public static void menuTerlaris(int[][] penjualan) {
        int max = 0;
        String menuMax = "";

        for (int menu = 0; menu < JUMLAH_MENU; menu++) {
            int total = 0;
            for (int hari = 0; hari < JUMLAH_HARI; hari++) {
                total += penjualan[hari][menu];
            }
            if (total > max) {
                max = total;
                menuMax = namaMenu[menu];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuMax + " (" + max + " porsi)");
    }

    // Fungsi hitung rata-rata penjualan per menu
    public static void rataRataPenjualan(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int menu = 0; menu < JUMLAH_MENU; menu++) {
            int total = 0;
            for (int hari = 0; hari < JUMLAH_HARI; hari++) {
                total += penjualan[hari][menu];
            }
            double rata = (double) total / JUMLAH_HARI;
            System.out.printf("%-15s: %.2f porsi/hari%n", namaMenu[menu], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] penjualan = new int[JUMLAH_HARI][JUMLAH_MENU];

        inputData(penjualan, sc);
        tampilkanTabel(penjualan);
        menuTerlaris(penjualan);
        rataRataPenjualan(penjualan);

        sc.close();
    }
}
