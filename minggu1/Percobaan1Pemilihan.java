import java.util.Scanner;
public class Percobaan1Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROSES MENGHITUNG NILAI AKHIR");
        System.out.println("====================");

        System.out.print("nilai tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("nilai kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("nilai UAS: ");
        double uas = sc.nextDouble();

        //Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100. 
        // Ketika pengguna memasukkan di luar rentang tersebut maka output “nilai tidak valid
        if(tugas < 0 || tugas > 100 ||
           kuis < 0 || kuis > 100 ||
           uts < 0 || uts > 100 ||
           uas < 0 || uas > 100) {

            System.out.println("Nilai tidak valid");
            return;
        }
        //20% nilai tugas, 20% dari nilai kuis, 30% nilai UTS, dan 30% nilai UAS
        double nilaidiAkhir = (0.2*tugas) + (0.2*kuis) + (0.3*uts) + (0.3*uas);

        String huruf;
        String status;

        //Ketika nilai akhir sudah selanjutnya lakukan konversi nilai 
        if(nilaidiAkhir >= 85) huruf = "A";
        else if(nilaidiAkhir >= 75) huruf = "B+";
        else if(nilaidiAkhir >= 70) huruf = "B";
        else if(nilaidiAkhir >= 60) huruf = "C+";
        else if(nilaidiAkhir >= 55) huruf = "C";
        else if(nilaidiAkhir >= 40) huruf = "D";
        else huruf = "E";

        System.out.println("====================");
        System.out.println("====================");

        //jika nilai huruf D dan E maka TIDAK LULUS.
        if(huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C"))
            status = "SELAMAT ANDA LULUS";
        else
            status = "TIDAK LULUS";

        System.out.println("Nilai akhir : " + nilaidiAkhir);
        System.out.println("Nilai huruf : " + huruf);
        System.out.println("====================");
        System.out.println("====================");
        System.out.println(status);
    }
}


