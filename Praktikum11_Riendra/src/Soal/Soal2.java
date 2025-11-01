package Soal;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total,harga,i;
        double diskon,totDis;
        total = 0;
        while(true){
            System.out.print("Masukkan harga barang (0 untuk selesai): ");
            harga = sc.nextInt();
            
            total += harga;
            if (harga == 0) 
            break;       
        }
        System.out.println("Total Belanja: " + total);
        if (total >= 100000){
                diskon = 0.1;
                totDis = total - (total * diskon);
                System.out.println("Anda mendapat diskon 10%");
                System.out.println("Total bayar: " + totDis);
            } else {
            System.out.println("Anda Tidak Mendapat Diskon");
        }
        
        
    }
    
}
