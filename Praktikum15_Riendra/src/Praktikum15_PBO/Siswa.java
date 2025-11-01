package Praktikum15_PBO;

/**
 *
 * @author abi
 */
public class Siswa {
    private String nama,jurusan;
    private int nis;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public void setNis(int nis){
        this.nis = nis;
    }
    public int getNis(){
        return this.nis;
    }
    public void tampilData(){
        System.out.println("Nama: "+nama);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("Nis: "+nis);
    }
}
