package Tugas;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Bulan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String[] bulan ={
            "Januari",
            "February",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember",
        
        };
        System.out.println("======== BULAN =======");
        System.out.print("Masukkan Angka(1-12): ");
        angka = sc.nextInt();
        
        if(angka >= 1 && angka <= 12){
        System.out.println("====================");
        System.out.println(bulan[angka-1]);
        System.out.println("====================");
        } else {
            System.out.println("====================");
            System.out.println("MASUKAN YANG BENAR!!");
            System.out.println("====================");
        }
        
    }
    
}
