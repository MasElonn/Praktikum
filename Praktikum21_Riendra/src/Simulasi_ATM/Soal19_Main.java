
package Simulasi_ATM;
import java.util.Scanner;

public class Soal19_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soal20_Nasabah[] nasabah = new Soal20_Nasabah[2];
        nasabah[0] = new Soal20_Nasabah("MasElonn",9000000);
        nasabah[1] = new Soal20_Nasabah("Rammstein", 1000000);
        int opsi,i = 0,opNasa,keluar=0;
        double tm;
        
        
        System.out.println("_-== List Nasabah ===-_");
        for (Soal20_Nasabah nasabah1 : nasabah) {
            i++;
            System.out.println("|"+i+"."+nasabah1.getNama());
        }
        System.out.println("=======================");
        System.out.print("Pilih Nasabah:");
        opNasa=sc.nextInt();
        
        opNasa-= 1;
        while(keluar!= 4){
        System.out.println(" _-====== ATM =====-_");
        System.out.println("|  1.Cek Saldo       |");
        System.out.println("|  2.Tarik Uang      |");
        System.out.println("|  3.Setor Uang      |");
        System.out.println("|  4.Keluar          |");
        System.out.println("-~=================~-");
            
            System.out.print("Pilih Opsi: ");
            opsi=sc.nextInt();
            
            switch(opsi){
                case 1:
                    System.out.println("Saldo Anda: "+nasabah[opNasa].cekSaldo());
                    break;
                case 2:
                    System.out.print("Tarik Uang sebesar: ");
                    tm=sc.nextDouble();
                    nasabah[opNasa].tarikUang(tm);
                    
                    break;
                case 3:
                    System.out.print("Setor Uang sebesar: ");
                    tm=sc.nextDouble();
                    nasabah[opNasa].setorUang(tm);
                    break;
                case 4:
                    keluar=4;
                    break;
            }
        }
        
    }
    
}
