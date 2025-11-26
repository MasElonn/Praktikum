package praktikum21_riendra;

class Barang {
    String nama;
    int harga;
    int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("\nNama Barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Buku", 5000, 10);
        Barang barang2 = new Barang("Pensil", 1000, 20);

        barang1.tampilkanInfo();
        barang2.tampilkanInfo();

        barang1.tambahStok(5);
        barang2.kurangiStok(10);

        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
    }
}
