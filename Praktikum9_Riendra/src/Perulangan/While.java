package Perulangan;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class While {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int angka, fac, i;
        
         System.out.println("=== PROGRAM PENGITUNG FAKTORIAL DENGAN WHILE ===");
         System.out.print("Masukkan Bilangan: ");
         angka = sc.nextInt();
         
         fac = 1;
         i = 1;
         
         while( i <= angka) {
             fac = fac * i;
             i++;
             
         }
         System.out.println("Nilai Faktorial Bilangan Tersebut adalah: " + fac);
    }
    
}
