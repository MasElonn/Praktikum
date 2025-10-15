/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Volume_tabung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jari2, tinggi;
        double volume;
        
        System.out.print("Masukkan jari-jari: ");
        jari2 = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = sc.nextInt();
        
        volume = Math.PI * jari2 * jari2 * tinggi;
        
        System.out.printf("Volume Tabung: %f\n", volume);
        
        
    }
}
