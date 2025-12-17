// 12S25037 - Laura Lubis
// 12S25027 - Jessica Mariani Situmorang
import java.util.*;
import java.lang.Math;

public class soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahData, i, gaji, dataLain, totalLolos;
        double ipk;
        String nama;
        boolean status;

        jumlahData = Integer.parseInt(input.nextLine());
        for (i = 1; i <= jumlahData; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            dataLain = Integer.parseInt(input.nextLine());
            status = cekKelulusan(ipk, gaji);
            if (status) {
                System.out.println(nama + "-> Lolos");
                totalLolos = jumlahData - dataLain;
            } else {
                System.out.println(nama + "-> Tidak Lolos");
            }
        }
        System.out.println("Total Lolos :" + totalLolos);
    }
    
    public static boolean cekKelulusan(double nilaiIpk, int penghasilan) {
        boolean hasil;

        if (nilaiIpk >= 3.0 && penghasilan <= 3000000) {
            hasil = true;
        } else {
            hasil = false;
        }
        
        return hasil;
    }
}
