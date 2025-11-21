package Soal3;

/**
 *
 * @author abi
 */
public class DataKaryawan {
    public static void main(String[] args) {
        Karyawan[] k = new Karyawan[3];
        
        k[0] = new Karyawan();
        k[1] = new KaryawanTetap();
        k[2] = new KaryawanMagang();
        
        for (int i=0;i<k.length;i++){
            k[i].tampilkanInfo();

            }   
        }
    }
