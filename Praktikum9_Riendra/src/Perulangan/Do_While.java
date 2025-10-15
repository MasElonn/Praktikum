package Perulangan;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, i ,fac;
        
         System.out.println("=== PROGRAM PENGITUNG FAKTORIAL DENGAN DO WHILE ===");
         System.out.print("Masukkan Bilangan: ");
         angka = sc.nextInt();
         

         fac = 1;
         i = 1;
         do {
             fac = fac * i;    
             i++;

         }  while (i <= angka);
         System.out.println("Nilai Faktorial Bilangan Tersebut adalah: " + fac);
    
    }
    
}
