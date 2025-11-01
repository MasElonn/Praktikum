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
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[5];
        int i;
        
        
        for(i=0;i<angka.length;i++){
            System.out.printf("Masukkan Angka ke-%d : ",i);
            angka[i] = sc.nextInt();
        }
        System.out.println("\nUrutan Array Terbalik");
        
        for( i = 0; i < angka.length; i++){

            System.out.println("Array ke-"+i+":"+ angka[angka.length-1-i]);
          
        }
    }
    
}
