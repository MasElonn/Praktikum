package praktikum21_riendra;

class Karyawan {
    private String nama;
    private double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}

class Manager extends Karyawan {
    private double tunjangan;

    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double hitungTotalGaji() {
        return getGajiPokok() + tunjangan;
    }
}

public class soal15 {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 5000000, 1000000);
        System.out.println("Nama: " + manager.getNama());
        System.out.println("Gaji Pokok: " + manager.getGajiPokok());
        System.out.println("Tunjangan: " + manager.getTunjangan());
        System.out.println("Total Gaji: " + manager.hitungTotalGaji());
    }
}