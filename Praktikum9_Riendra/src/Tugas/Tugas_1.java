package Tugas;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Tugas_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,angka; //deklarasi variabel
        
        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt(); //menerima inputan
        
        
        for (i=1;i<=angka; i++){
            
            if(i % 5 == 0) continue;
            System.out.println(i);
        }
    } 
}
