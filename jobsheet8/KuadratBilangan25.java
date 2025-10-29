
import java.util.Scanner;

public class KuadratBilangan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N = ");
        int N = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= N; i++) {
            int kuadrat = 0;
            System.out.print(i + ". N = " + i + " -> jumlah kuadrat = ");
            
            for (int j = 1; j <= i; j++) {
                kuadrat = j * j;
                total += kuadrat;

                System.out.print(kuadrat);
                if (j < i) {
                    System.out.println(" + ");
                }
            }
            System.out.println(" = " + total);
        
        }

        //System.out.println("Jumlah semua kuadrat 1.." + N + " = " + total);
        sc.close();
    }
}
