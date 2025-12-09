package Soal2;

/**
 *
 * @author abi
 */
public class Main {
    public static void main(String[] args) {
        Jadwal jl = new Jadwal();
        MataKuliah[] mk = new MataKuliah[]{new MataKuliah("KF90","IPA","Harianto",4),
                                                                       new MataKuliah("DL77","IPS","Denis",3)};
        String[] hari = {"Senin","Selasa"}; 
        jl.tambahMataKuliah(hari, mk);
        jl.tampilJadwal();
    }
    
}
