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
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
       
        System.out.print("Masukkan isi array: ");
        r = sc.nextInt();
        
        int[] num = new int[r];
        
        for(int i=0; i<r;i++){
            System.out.printf("Masukkan elemen array ke-%d: ",i+1);
            num[i] = sc.nextInt();
        }
     
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < r; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }

        System.out.printf("Bilangan terbesar: %d\n",max);
        System.out.printf("Bilangan terkecil: %d\n",min);
    }
    
}
