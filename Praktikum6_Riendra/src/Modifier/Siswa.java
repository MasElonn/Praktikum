package Modifier;

/**
 *
 * @author abi
 */
public class Siswa {
    
    public String nama;
    private int nis;
    protected String jurusan;
    String kelas;
    
    public void setNis(int nis) {
        this.nis = nis;
    }
    
    public int getNis() {
        return this.nis;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + nis);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Kelas : " + kelas);
    }
}
