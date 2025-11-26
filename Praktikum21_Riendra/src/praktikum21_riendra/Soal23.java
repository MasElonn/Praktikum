package praktikum21_riendra;

public class Soal23 {
    public static int cariNilaiTertinggi(int[] t){
        int tertinggi=t[0];
        for(int i:t){
            
        tertinggi=Math.max(tertinggi,i);
        }
        return tertinggi;
    }
    public static int cariNilaiTerRendah(int[] t){
        int terrendah=t[0];
        for(int i=0;i<t.length;i++){
            if(i==0) terrendah =t[i];
            terrendah=Math.min(terrendah,t[i]);
        }
        return terrendah;
    }
    public static void main(String[] args) {
        int[] nilai = {78,78,45,90,58};
        for(int i:nilai){
            System.out.print(i+" ");
        }
        System.out.println("\nNilai Teringgi dari array: "+cariNilaiTertinggi(nilai));
        System.out.println("Nilai Terrendah dari array: "+cariNilaiTerRendah(nilai));
        
    }
    
}
