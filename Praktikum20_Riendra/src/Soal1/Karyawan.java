package Soal1;

/**
 *
 * @author abi
 */
public class Karyawan {
    private String nama,divisi,nip;

    public void setNip(String nip){
        this.nip=nip;
    }
    public String getNip(){
        return nip;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setDivisi(String divisi){
        this.divisi=divisi;
    }
    public String getDivisi(){
        return divisi;
    }
    public void tampilData(){
        System.out.println("===== Data Karyawan =====");
        System.out.println("NIP     : "+nip);
        System.out.println("Nama    : "+nama);
        System.out.println("Divisi  : "+divisi);
    }
    
}
