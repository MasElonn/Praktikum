/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier;

/**
 *
 * @author abi
 */
public class Guru {
    public String nama;
    private int nip;
    String bidang;
    
    public void setNip(int nip) {
        this.nip = nip;
    }
    
    public int getNip() {
        return this.nip;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Bidang : " + bidang);
    }
    
}
