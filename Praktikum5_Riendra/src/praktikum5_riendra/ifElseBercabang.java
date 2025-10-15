package praktikum5_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class ifElseBercabang {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int totalBelanja;
        
        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = sc.nextInt();
        
        if(totalBelanja >= 2000000) {
             System.out.println("Selamat Anda Mendapatkan Doorprize Kulkas");
        } else if (totalBelanja >= 1000000){
             System.out.println("Selamat Anda Mendapatkan sepeda");
        } else if(totalBelanja >= 500000){
            System.out.println("Selamat Anda Mendapatkan Kompor Gas"); 
        }  else {
             System.out.println("Mohon Maaf Anda belum Beruntung");
        }
    }
}
