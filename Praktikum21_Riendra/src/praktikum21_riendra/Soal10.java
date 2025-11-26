package praktikum21_riendra;

class Buku{
   String judul;
   String penulis;
   int harga;
   
   public Buku(String judul, String penulis, int harga){
       this.judul = judul;
       this.penulis = penulis;
       this.harga = harga;
   }
   
   public void tampilInfo(){
       System.out.println("Judul Buku: " + judul);
       System.out.println("Penulis Buku: " + penulis);
       System.out.println("Harga Buku: " + harga);
   }
}

public class Soal10 {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[3];
        daftarBuku[0] = new Buku("Si merah", "Kevin", 200000);
        daftarBuku[1] = new Buku("Java 101", "Bu venny", 300000);
        daftarBuku[2] = new Buku("Linux from Scratch", "Linux Torvalds", 400000);

        System.out.println("===== Daftar Buku =====");
        for (Buku buku : daftarBuku) {
            buku.tampilInfo();
            System.out.println();
        }

        Buku bukuTermahal = daftarBuku[0];
        for (int i = 1; i < daftarBuku.length; i++) {
            if (daftarBuku[i].harga > bukuTermahal.harga) {
                bukuTermahal = daftarBuku[i];
            }
        }

        System.out.println("===== Buku Harga Tertinggi =====");
        bukuTermahal.tampilInfo();
    }
}