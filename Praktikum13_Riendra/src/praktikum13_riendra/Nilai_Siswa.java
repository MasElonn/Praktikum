package praktikum13_riendra;

import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Nilai_Siswa {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int[] nilai = new int[3];
        double rata;
        int mat,ipas,daspro;
        
        for(int i =0; i < nilai.length; i++){
            System.out.printf("Masukkan nilai Siswa ke-%d \n",i+1);
            System.out.print("Matematika = ");
            mat = sc.nextInt();
            System.out.print("IPAS = ");
            ipas = sc.nextInt();
            System.out.print("DasPro = ");
            daspro = sc.nextInt();
           
            rata = (mat+ipas+daspro) / nilai.length;
            System.out.printf("Rata-Rata Nilai Siswa ke-%d = %.1f\n ",i+1,rata);

            System.out.println("===============================================");
        }
        
    }
    
}
