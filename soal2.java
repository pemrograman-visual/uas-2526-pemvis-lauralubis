// 12S25037 - Laura Lubis
// 12S25027 - Jessica Mariani Situmorang

import java.util.*;
import java.lang.Math;

public class soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, sisa;
        String status;

        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n];
        int[] stok = new int[n];
        int[] terjual = new int[n];

        for (i = 0; i <= n - 1; i++) {
            nama[n] = input.nextLine();
            stok[n] = Integer.parseInt(input.nextLine());
            terjual[n] = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        System.out.println("Hasil Laporan");
        System.out.println("Nama" + "Stok Awal" + "Terjual" + "Sisa" + "Status");
        for (i = 0; i <= n - 1; i++) {
            sisa = stok[n] - terjual[n];
            status = cekStatus(sisa);
        }
        System.out.println("nama,terjual,sisa,status");
    }
    
    public static String cekStatus(int sisaBarang) {
        String pesan;

        if (sisaBarang == 0) {
            pesan = "Habis, segera restock!";
        } else {
            if (sisaBarang < 5) {
                pesan = "Stok menipis.";
            } else {
                pesan = "Stok aman.";
            }
        }
        
        return pesan;
    }
}
