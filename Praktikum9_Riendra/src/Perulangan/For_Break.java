package Perulangan;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class For_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, b ;
        
        System.out.println("====PROGRAM LOOP DENGAN CONTINUE====");
        for(b=0; true;){
            System.out.print("Masukkan Bilangan: ");
            angka = sc.nextInt();
            
            b += angka;
            
            if(b>50) break;
        }
        System.out.printf("Angka berhenti pada jumlah Angka %d \n", b);
    }
}
