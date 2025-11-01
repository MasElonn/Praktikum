/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author abi
 */
public class Program {
   public static void main(String[] args) {
        Hewan[] daftarHewan = {
            new Kucing(),
            new Ikan(),
            new Burung()
        };
        
        Orang[] daftarOrang = {
            new Orang("Ani"),
            new Orang("Budi"),
            new Orang("Siti")
        };
 
        for (int i = 0; i < daftarOrang.length; i++) {
            daftarOrang[i].peliharaanHewan(daftarHewan[i]);
        }
 
       
        for (int i = 0; i < daftarOrang.length; i++) {
            daftarOrang[i].ajakPeliharaanJalanJalan();
        }
    }
    
}
