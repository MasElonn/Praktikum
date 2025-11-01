/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author abi
 */
public abstract class Hewan {
    private int umur;
    
    protected Hewan(){
        this.umur = 0;
    }
    
    public void tambahUmur(){
        this.umur += 1;
    }

    public abstract void bergerak();
    
}