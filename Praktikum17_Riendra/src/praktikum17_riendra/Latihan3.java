package praktikum17_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====  PENDAFTARAN ANGGOTA GYM  =====");
        String nama,daftar = null;
        int jumAng = 0;
        
        do{
            System.out.print("\nMasukkan nama Anggota: ");
            nama = sc.nextLine();
            jumAng++;
            System.out.print("Daftar Anggota lagi? [ya / tidak] > ");
            daftar = sc.nextLine().toLowerCase();
            
        }while(!"tidak".equals(daftar));
        System.out.println("\n-===================================-");
        System.out.println("Total Anggota yang didaftarkan: "+jumAng);
        System.out.println("-===================================-");
        
    }
    
}
