/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Do_While_Break {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int angka, b;
        
         System.out.println("=== PROGRAM LOOP DENGAN BREAK ===");
         b = 0;
         do {
         System.out.print("Masukkan Bilangan: ");
         angka = sc.nextInt();
         b += angka;
         if (b>50) break;

         } while (true); {
            System.out.printf("Angka Berhenti pada angka %d\n",b);

        }
      }
}
