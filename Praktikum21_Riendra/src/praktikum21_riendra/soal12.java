package praktikum21_riendra;
interface Diskon {
   public void hitungdiskon();
    
}

//////////////////////////////////////////////////////
class Buku{
        public double hargaasli,diskon;
    
    public void setharga (int hargaasli){
        this.hargaasli = hargaasli;
    }
    
    public void setdiskon (double diskon){
        this.diskon = diskon;
    }
}

//////////////////////////////////////////////////////////////////////////
class Bukufiksi extends Buku implements Diskon {
private double hargaseldiskon, jumdiskon;
private String judul, penulis;
    
    
    @Override
    public void hitungdiskon() {
     jumdiskon = hargaasli * (diskon / 100.0);
     hargaseldiskon = hargaasli - jumdiskon;
    }
    
    public void bukufiksi (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void tampildata(){
        hitungdiskon();
        
        System.out.println("Judul buku                  : " + this.judul);
        System.out.println("Penulis buku                : " + this.penulis);
        System.out.println("Harga asli                  : " + hargaasli);
        System.out.println("Harga setelah diskon diskon : " + hargaseldiskon);
    }
}
class NonBukufiksi extends Buku implements Diskon {
private double hargaseldiskon, jumdiskon;
private String judul, penulis;
    
    
    @Override
    public void hitungdiskon() {
     jumdiskon = hargaasli * (diskon / 100.0);
     hargaseldiskon = hargaasli - jumdiskon;
    }
    
    public void bukufiksi (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void tampildata(){
        hitungdiskon();
        
        System.out.println("Judul buku                  : " + this.judul);
        System.out.println("Penulis buku                : " + this.penulis);
        System.out.println("Harga asli                  : " + hargaasli);
        System.out.println("Harga setelah diskon diskon : " + hargaseldiskon);
    }
}
public class soal12 {
    public static void main(String[] args) {
        Bukufiksi F = new Bukufiksi();
        NonBukufiksi N = new NonBukufiksi();
        
        F.setharga(200000);
        F.setdiskon(50);
        F.bukufiksi("Ich Heisenberg", "Chris Waltz");
        F.tampildata();
        System.out.println("");
        N.setharga(700000);
        N.setdiskon(30);
        N.bukufiksi("Faint", "Mike Shinoda");
        N.tampildata();
    }
    
}
