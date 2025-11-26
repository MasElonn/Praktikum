package praktikum21_riendra;

interface Evaluasi{
    public double hitungNilaiAkhir();
}

class Penilaian implements Evaluasi{
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Penilaian(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    @Override
    public double hitungNilaiAkhir() {
        return (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.50 * nilaiUAS);
    }


}
public class Soal31 {
    public static void main(String[] args) {
        Penilaian p = new Penilaian(89,97.9,87);
        System.out.println("Nilai Akhir Adalah: "+p.hitungNilaiAkhir());
    }
}