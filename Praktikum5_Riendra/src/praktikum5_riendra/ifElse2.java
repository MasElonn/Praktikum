package praktikum5_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class ifElse2 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int angka;
        
        System.out.print("Masukkan Nilai: ");
        angka = sc.nextInt();
        
        if(angka>75){
            System.out.println("Selamat Anda Diterima");
        } else {
            System.out.println("Ngapunten Anda TIDAK diterima:( ");
        }
    }
    
}
