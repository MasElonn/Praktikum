package praktikum21_riendra;

import java.util.Scanner;

class Cuaca {
    private double suhu;
    private String kondisi;

    public Cuaca(double suhu, String kondisi) {
        this.suhu = suhu;
        this.kondisi = kondisi;
    }

    public void tampilkanPrediksi() {
        if (suhu < 15) {
            kondisi = "Dingin";
        } else if (suhu < 25) {
            kondisi = "Sedang";
        } else {
            kondisi = "Panas";
        }
        System.out.println("Suhu: " + suhu + "C");
        System.out.println("Prediksi Kondisi Cuaca: " + kondisi);
    }

    public double getSuhu() {
        return suhu;
    }
    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}

public class Soal26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu (C): ");
        double suhuInput = sc.nextDouble();

        Cuaca c = new Cuaca(suhuInput, "");
        c.tampilkanPrediksi();
    }
    
}
