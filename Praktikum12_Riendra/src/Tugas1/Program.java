/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author abi
 */
public class Program {
    public static void main(String[] args){
  
    Mobil m = new Mobil() ;
    Pesawat p = new Pesawat();
    
    m.bahanBakar("mie Ayam");
    m.kecepatan(50);
    System.out.println("=========== Mobil ===========");
    m.infoKendaraan();
    
    p.bahanBakar("mie Ayam");
    p.kecepatan(1090);
    System.out.println("=========== Pesawat ===========");
    p.infoKendaraan();
    
    }
}
