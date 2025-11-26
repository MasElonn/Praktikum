package praktikum21_riendra;

import java.util.Scanner;

interface InfoCuaca {
    void tampilDetail();
}


class Cuaca implements InfoCuaca {
    private double suhu;
    private String kondisi;

    public Cuaca(double suhu, String kondisiCuaca) {
        this.suhu = suhu;
        this.kondisi = kondisiCuaca;
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

    @Override
    public void tampilDetail() {
        if (suhu < 15) {
            kondisi = "Dingin";
        } else if (suhu < 25) {
            kondisi = "Sedang";
        } else {
            kondisi = "Panas";
        }
        System.out.println("Suhu: " + suhu);
        System.out.println("Kondisi Cuaca: " + kondisi);
    }
}

public class Soal27 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu (C): ");
        double suhuInput = sc.nextDouble();

        Cuaca c = new Cuaca(suhuInput, "");
        c.tampilDetail();
    }
    
}
