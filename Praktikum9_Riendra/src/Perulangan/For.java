package Perulangan;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class For {
    public static void main(String[] args) {
         int angka,fac,i;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("=== PROGRAM PENGITUNG FAKTORIAL DENGAN FOR ===");
         System.out.print("Masukkan Bilangan: ");
         angka = sc.nextInt();
         
         fac = 1;
         
         for( i = 1; i <= angka; i++) {
             fac = fac * i;
         }
         System.out.println("Nilai Faktorial Bilangan Tersebut adalah: " + fac);
    }
    
}
