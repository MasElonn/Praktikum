package PBO;

/**
 *
 * @author abi
 */
public class Siswa {
    private String nama;
    private String nis;
    private double nilai_akhir;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNis(String nis) {
        this.nis = nis;
    }
    
    public void setNilaiAkhir(double nilai) {
        this.nilai_akhir = nilai;
     

    }
       
    public String getNama() {
        return nama;
    }
     
    public String getNis(){
        return nis;
    }
   
    public double getNilaiAKhir() {
        return nilai_akhir;
    }
    
    
    
    public void tampilData() {
        System.out.println("====================");
        System.out.println("Nama Anda: " + nama);
        System.out.println("NIS Anda: " + nis);
        
         if(nilai_akhir >= 0 && nilai_akhir <= 100) {
            if(nilai_akhir >= 90 && nilai_akhir<= 100) {
                System.out.println("Nilai Anda: A, EXCELENT");
            } else if (nilai_akhir >= 80 && nilai_akhir <= 89) {
                System.out.println("Nilai Anda: B, Tingkatkan Prestasi");
            } else if(nilai_akhir >= 60 && nilai_akhir <= 79) {
                System.out.println("Nilai Anda: C, Belajar Lagi");
            } else if(nilai_akhir >= 50 && nilai_akhir <= 59) {
                System.out.println("Nilai Anda: D, Nice Try");
            } else {
                System.out.println("Nilai Anda:  E, 🤦🤦");
            }
            
            } else {
            System.out.println("Nilai Invalid, Masukkan 0 - 100");
         }
         
      //  System.out.println("Nilai Anda: " + nilai_akhir);
        System.out.println("====================");
    }
}
