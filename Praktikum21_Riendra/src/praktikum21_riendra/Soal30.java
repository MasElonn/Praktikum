package praktikum21_riendra;

import java.util.Scanner;


public class Soal30 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        
        int nilai; 
        
        System.out.print("Masukkan Nilai 0 - 100 : ");
        nilai = sc.nextInt();
        
        if(nilai >= 0 && nilai <= 100) {
            if(nilai >= 90 && nilai <= 100) {
                System.out.println("Nilai A, EXCELENT");
            } else if (nilai >= 80 && nilai <= 89) {
                System.out.println("Nilai B, Tingkatkan Prestasi");
            } else if(nilai >= 60 && nilai <= 79) {
                System.out.println("Nilai C, Belajar Lagi");
            } else if(nilai >= 50 && nilai <= 59) {
                System.out.println("Nilai D, Nice Try");
            } else {
                System.out.println("Nilai E, 🤦🤦");
            }
            
        } else {
            System.out.println("Nilai Invalid, Masukkan 0 - 100");
        }
    }
}
    

