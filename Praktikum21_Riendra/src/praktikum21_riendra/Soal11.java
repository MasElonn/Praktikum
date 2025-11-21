package praktikum21_riendra;
class Buku{
    private String judul,penulis;
    private int harga;
    
    public Buku(String judul,String penulis, int harga){
        this.judul=judul;
        this.penulis=penulis;
        this.harga=harga;
        
    }
    public void tampilInfo(){
        System.out.println("\nJudul Buku: "+judul);
        System.out.println("Penulis Buku: "+penulis);
        System.out.println("harga Buku: "+harga);
    }
    
}

public class Soal11 {
    public static void main(String[] args) {
        Buku a = new Buku("Si merah","Kevin",200000);
        a.tampilInfo();
        Buku b = new Buku("Java 101","Bu Venny",300000);
        b.tampilInfo();
        Buku c = new Buku("Linux From Scratch","Linux Torvalds",400000);
        c.tampilInfo();
    }
    
}
