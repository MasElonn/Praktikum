package praktikum21_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int jumlah, sDiskon, tBayar, harga;
        double diskon = 0;

        System.out.print("Masukkan Nama Barang: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Harga: ");
        harga = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang: ");
        jumlah = sc.nextInt();

        sDiskon = harga * jumlah;

        if (sDiskon >= 2000000) {
            diskon = 50;
        } else if (sDiskon >= 1000000) {
            diskon = 40;
        } else if (sDiskon >= 500000) {
            diskon = 30;
        } else if(sDiskon >= 250000){
            diskon = 20;
        }

        System.out.println("Nama Barang: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Sebelum Diskon: " + sDiskon);
        System.out.println("Besar Diskon: " + (sDiskon * (diskon / 100)));
        tBayar = (int) (sDiskon - (sDiskon * (diskon / 100)));
        System.out.println("Total Bayar Akhir: " + tBayar);
    }

}
