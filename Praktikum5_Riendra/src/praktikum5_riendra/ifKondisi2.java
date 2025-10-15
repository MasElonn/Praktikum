package praktikum5_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class ifKondisi2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int angka;
        
        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();
        
        if(angka>70){
            System.out.println("Selamat Anda Diterima");
        } 
    }
}
