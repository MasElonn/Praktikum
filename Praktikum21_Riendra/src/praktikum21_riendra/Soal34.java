package praktikum21_riendra;
class Orang {
    private String nama;

    public Orang(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
class Siswa extends Orang {
    private String kelas;

    public Siswa(String nama, String kelas) {
        super(nama); 
        this.kelas = kelas;
    }
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void tampilkanData() {
        System.out.println("Nama: " + getNama());
        System.out.println("Kelas: " + getKelas());
    }
}

public class Soal34 {
    public static void main(String[] args) {
         Siswa siswa1 = new Siswa("Andi", "X RPB");

        System.out.println("=== Data Siswa Awal ===");
        siswa1.tampilkanData();
        siswa1.setNama("Budi");
        siswa1.setKelas("X RPB");

        System.out.println("\n=== Data Siswa Setelah Perubahan ===");
        siswa1.tampilkanData();
    }
    
}
