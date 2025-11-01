/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,i,suku=0;
        System.out.print("Masukkan Bilanganaanw: ");
        r = sc.nextInt();
        int[] geometri = new int[r];
        
        for(i=0;i<r;i++){
            System.out.printf("Masukkan Bilangan ke-%d: ",i+1);
            geometri[i] = sc.nextInt();
             suku += geometri[i]; 
            
        }
        System.out.println("=== Barisan Bilangan ===");
        
        for(int x : geometri){
            System.out.print(x+" ");
        }
        System.out.println("\nTotal Penjumlahan: "+suku);
       
     }
    
}
