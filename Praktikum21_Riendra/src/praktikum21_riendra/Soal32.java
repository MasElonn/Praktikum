package praktikum21_riendra;

public class Soal32 {
    public static void main(String[] args) {
        
        String[] namaSiswa = {"Andi", "Budi", "Citra", "Dina", "Eko"};

        
        System.out.println("Nama siswa secara terbalik:");
        for (int i = namaSiswa.length - 1; i >= 0; i--) {
            System.out.println(namaSiswa[i]);
        }
    }    
}
