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
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,i=0;
        
        System.out.print("Masukkan Jumlah Array: ");
        r= sc.nextInt();
        
        int[] num = new int[r];
        
        for(i=0;i<r;i++){
            System.out.printf("Masukkan Array ke-%d: ",i+1);
            num[i] = sc.nextInt();
        }
        for(i=0;i<r;i++){
            if(num[i]%2 == 0){
                System.out.println("Angka Genap: "+num[i]);
            }
        }
        for(i=0;i<r;i++){
            if(num[i]%2 == 1){
                System.out.println("Angka Ganjil: "+num[i]);
            }
        }
        
    }
    
}
