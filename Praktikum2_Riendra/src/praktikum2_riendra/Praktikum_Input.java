package praktikum2_riendra;
import java.util.Scanner;

public class Praktikum_Input {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         int usia; //Deklarasi Variabel rUsIa 
         String nama, kelas;
         
         System.out.print("Masukkan Nama Anda: ");
         nama = sc.nextLine(); //Menyimpan Inputan user
         
         System.out.print("Masukkan Kelas Anda: ");
         kelas = sc.nextLine();
         
         System.out.print("Masukkan Usia mu: ");
         usia = sc.nextInt();
         
         System.out.println("Nama Anda adalah: " + nama);
         System.out.println("Kelas Anda adalah: " + kelas);
         System.out.println("Usia Anda adalah: " + usia);
         
         sc.close();
     }
    
}