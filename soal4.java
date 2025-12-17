// 12S25037 - Laura Lubis
// 12S25027 - Jessica Mariani Situmorang
import java.util.*;
import java.lang.Math;

public class soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalShift, maxShift, minShift;
        double rataRata;
        String minNama, maxNama, pesan, kesimpulan;

        totalShift = 0;
        maxShift = -1;
        minShift = 1000;
        String[] shiftNama = new String[n];
        int[] shiftArray = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArray[i] = input.nextLine();
            shiftArray[i] = Integer.parseInt(input.nextLine());
        }
        for (i = 0; i <= n - 1; i++) {
            totalShift = totalShift + shiftArray[i];
            if (shiftArray[i] > maxShift) {
                maxShift = shiftArray[i];
                maxNama = shiftNama[i];
            }
            if (shiftArray[i] < minShift) {
                minShift = shiftArray[i];
                minNama = shiftNama[i];
            }
        }
        rataRata = totalShift;
        System.out.println("Daftar shift");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(shiftNama[i] + "=" + shiftArray[i]);
        }
        System.out.println("");
        System.out.println("Total shift" + totalShift);
        System.out.println("Rata-rata" + rataRata);
        System.out.println("Shift terbanyak:" + maxNama + "(" + maxShift + ")");
        System.out.println("Shift tersedikit:" + minNama + "(" + minShift + ")");
        pesan = cekKesimpulan(maxShift, minShift);
        System.out.println(kesimpulan);
    }
    
    public static String cekKesimpulan(int maxShift, int minShift) {
        String pesan;
        int selisih;

        selisih = maxShift - minShift;
        if (selisih >= 3) {
            pesan = "Distribusi tidak merata, beberapa asisten terbebani.";
        } else {
            pesan = "Distribusi shift cukup merata";
        }
        
        return pesan;
    }
}
