package praktikum17_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====  PROGRAM VOTING OSIS  =====");
        System.out.println("(Ketik ''selesai'' untuk mengakhiri )\n");

        String pil = null;
        int a = 0, b = 0;

        while (!"selesai".equals(pil)) {
            
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pil = sc.nextLine().toLowerCase();
            if ("a".equals(pil)) a++;
            if ("b".equals(pil)) b++;
            
        }
        System.out.println("-==========================-");
        System.out.println("Total Suara Kandidat A: " + a);
        System.out.println("Total Suara Kandidat b: " + b);
        System.out.println("-==========================-");
    }
}
