package praktikum17_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char pilih;
        int a1,a2;
        double hasil;
        
        System.out.println("====  KALKULATOR SEDERHANA  ====");
        System.out.println("Pilih Operasi:\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n");
        System.out.print("Masukkan pilihan (1-4): ");
        pilih = sc.next().charAt(0);
        
        System.out.println("-========================-");
        System.out.print("Masukkan angka Pertama: ");
        a1 = sc.nextInt();
        System.out.print("Masukkan angka Kedua: ");
        a2 = sc.nextInt();
        
        
        switch(pilih){
            case '1':
                hasil = a1 + a2;
                System.out.println("\nHasil Jumlahan: "+hasil);
                break;
           case '2':
                hasil = a1 - a2;
                System.out.println("Hasil Pengurangan: "+hasil);
                break;
           case '3':
                hasil = a1 * a2;
                System.out.println("Hasil Perkalian: "+hasil);
                break;
           case '4':
               if(a1 == 0 || a2 ==0){
                    System.out.println("Angka Tidak bisa dibagi 0");
               } else {
                   hasil = a1 / a2;
                    System.out.println("Hasil Pembagian: "+hasil);
               }
                break;
           default:
               System.out.println("-========================-");
               System.out.println("Masukkan Invalid");
            }   
        
    }
}