package praktikum21_riendra;

class Mahasiswa{
    private String nama;
    private int nim,nilai;
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNim(int nim){
        this.nim=nim;
    }
    public void setNilai(int nilai){
        this.nilai=nilai;
    }
    public String getNama(){
        return nama;
    }
    public int getNim(){
        return nim;
    }
    public int getNilai(){
        return nilai;
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNama("MAnang Soejono");
        m.setNim(92833);
        m.setNilai(90);
        
        System.out.println("===== Data Mahasiswa  =====");
        System.out.println("Nama: "+m.getNama());
        System.out.println("NIM: "+m.getNim());
        System.out.println("Nilai: "+m.getNilai());
        
    }
    
}