package Modifier;

/**
 *
 * @author abi
 */
public class SiswaMain {
    public static void main(String[] args) {
        
        Siswa s = new Siswa();
        s.nama = "Riendra";
        s.setNis(2);
        s.jurusan = "RPL";
        s.kelas = "XRPB";
        
        s.tampilData();
    }
    
}
