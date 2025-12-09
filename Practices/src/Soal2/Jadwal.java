package Soal2;

/**
 *
 * @author abi
 */
public class Jadwal {
    private String[] hari;
    MataKuliah[] daftarMataKuliah;
    
    public void tambahMataKuliah(String[] hari,MataKuliah[] mk){
        this.hari=hari;
        daftarMataKuliah=mk;
        
    }
    public void tampilJadwal(){
      int count = 0;
        for(MataKuliah p: daftarMataKuliah){
            
            System.out.println(hari[count]);
            count++;
            System.out.println("=================================");
            System.out.println("Kode Mata Kuliah: "+p.getKodeMK());
            System.out.println("Nama Mata Kuliah: "+p.getNamaMK());
            System.out.println("Nama Dosen: "+p.getNamaDosen());
            System.out.println("Jumlah SKS: "+p.getSKS());
            System.out.println("=================================\n");
        }
        
    }
    
}
