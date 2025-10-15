package praktikum5_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class ifElseBercabang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jam;
        
         System.out.print("Masukkan Waktu Parkir: ");
         jam = sc.nextInt();
         
         if(jam <= 5) {
              System.out.println("Biaya Parkir Anda 5000Rp");
         } else if(jam <= 10) {
              System.out.println("Biaya Parkir Anda 10000Rp");
         } else if(jam <= 15) {
              System.out.println("Biaya Parkir Anda 15000Rp");
         } else{
              System.out.println("Jam yang anda Masukkan Invalid");
              System.out.println("Maksimum waktu 15 Jam");
         }
    }
    
}
