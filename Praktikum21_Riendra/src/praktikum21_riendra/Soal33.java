package praktikum21_riendra;
class Siswa {
    private String nama;
    private String kelas;

    public Siswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilkanNama() {
        System.out.println("Nama Siswa: " + this.nama);
    }
    public void tampilkanKelas() {
        System.out.println("Kelas: " + this.kelas);
    }
}
public class Soal33 {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Andi", "XRPB");

        siswa1.tampilkanNama();
        siswa1.tampilkanKelas();
    }
    
}
