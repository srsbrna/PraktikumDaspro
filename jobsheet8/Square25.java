package jobsheet8;

import java.util.Scanner;

public class Square25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan nilai n = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i<=N; i++){
                System.out.print("*");
            }
        System.out.println();
        }
        sc.close();
    }
}
