package praktikum21_riendra;

/**
 *
 * @author abi
 */
public class Soal16 {
    public static void main(String[] args) {
        int[][] nilai = {
            {80,70,78,90},//joe
            {90,90,89,100},//mamang
            {70,87,70,86},//jodi
        };
       int nomorSiswa = 1;

        for (int[] siswa : nilai) {
            int total = 0;

            for (int n : siswa) {
                total += n;
            }

            double rata = (double) total / siswa.length;
            System.out.println("Rata-rata siswa " + nomorSiswa + ": " + rata);

            nomorSiswa++;
        }
    }
}
    
