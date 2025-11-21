package praktikum21_riendra;

import java.util.Scanner;

public class soal13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        int totalGanjil = 0;
        int totalGenap = 0;

        System.out.println("Bilangan ganjil:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
                totalGanjil += i;
            }
        }

        System.out.println("\nBilangan genap:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                totalGenap += i;
            }
        }

        System.out.println("\nTotal bilangan ganjil: " + totalGanjil);
        System.out.println("Total bilangan genap: " + totalGenap);
    }
}
