/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author abi
 */
public abstract class Kendaraan {
    double kecepatan;
    String bahanBakar;
    
    public void kecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public void bahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public void infoKendaraan(){
        System.out.println("Kecepatan Kendaraan " + kecepatan + " km/h");
        System.out.println("Bahan Bakar yang Digunakan: " + bahanBakar);
        this.bergerak();
         System.out.println("===========================================");
    }
    public abstract void bergerak();
}
