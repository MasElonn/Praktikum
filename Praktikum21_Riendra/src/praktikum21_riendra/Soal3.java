package praktikum21_riendra;

class Pegawai {
    String nama;
    double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

class Kasir extends Pegawai {
    double bonus;

    public Kasir(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Gaji: " + (gajiPokok + bonus));
    }
}

class Gudang extends Pegawai {
    double tunjangan;

    public Gudang(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + (gajiPokok + tunjangan));
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Pegawai", 3000000);
        Kasir kasir = new Kasir("Kasir", 3500000, 500000);
        Gudang gudang = new Gudang("Gudang", 3200000, 300000);

        pegawai.tampilkanData();
        System.out.println();
        kasir.tampilkanData();
        System.out.println();
        gudang.tampilkanData();
    }
}
