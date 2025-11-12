
import java.util.Scanner;

public class cariMenu25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                    "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Masukkan nama makanan yang dicari: ");
        String key = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(key)) {
                System.out.println("Menu tersedia!");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak ditemukan.");
        }

    }
}
