/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author abi
 */
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama) {
        this.nama = nama;
    }
    
    public void peliharaanHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println(this.nama);
        this.hewanPeliharaan.bergerak();
    }
    @Override
    public String toString() {
        return nama;
    }
}
