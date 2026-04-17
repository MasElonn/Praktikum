package Soal3;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Main {
    double berat;
    int jarak;
    
    static double hitungBiaya(double berat,int jarak){
        double biaya = 5000;
        if(jarak <= 10 ){
            biaya += 10000;
        } else if (jarak > 10 && jarak <= 50){
            biaya += 25000;
        } else if (jarak > 50){
            biaya += 50000;
        }
        if(berat > 5){
            biaya += 15000;
        }
        return biaya + (berat * 5000);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarak;
        double berat;
        
        System.out.println("==== Kalkulator Biaya Pengiriman paket ====");
        System.out.print("Masukkan Berat barang: ");
        berat = sc.nextDouble();
        System.out.print("Masukan Jarak Barang: ");
        jarak = sc.nextInt();
        System.out.println("Total Biaya: Rp"+hitungBiaya(berat,jarak));
    }
}
