import java.util.Scanner;

public class HitungIpArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mk.length];//Menyimpan nilai angka mahasiswa
        String[] nilaiHuruf = new String[mk.length];//Menyimpan hasil konversi nilai huruf
        double[] bobot = new double[mk.length];//Menyimpan bobot nilai untuk menghitung IP
        //mk.length artinya jumlah array mengikuti jumlah mata kuliah

        System.out.println("======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================================");

        // Input nilai
        for (int i = 0; i < mk.length; i++) {//Mengulang sebanyak jumlah mata kuliah
            System.out.print("Masukkan Nilai Angka untuk MK " + mk[i] + " : ");//meminta pengguna memasukkan nilai
            nilaiAngka[i] = sc.nextDouble();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);//Nilai angka  diubah menjadi nilai huruf dengan method konversiHuruf().
            bobot[i] = konversiBobot(nilaiHuruf[i]);//Nilai huruf kemudian diubah menjadi bobot nilai menggunakan method konversiBobot().
        }


        System.out.println("\n======================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;

        for (int i = 0; i < mk.length; i++) {//Program mengulang untuk menampilkan data setiap mk
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
                    //Menampilkan data dalam bentuk tabel yang rapi.

            totalBobot += bobot[i];//menjumlahkan seluruh bobot nilai
        }

        double ip = totalBobot / mk.length;//rumus

        System.out.println("======================================");
        System.out.printf("IP : %.2f\n", ip);
        //nilai IP semester mahasiswa dengan 2 angka di belakang koma.
    }

    // Konversi nilai angka → huruf
    static String konversiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    // Konversi huruf → bobot
    static double konversiBobot(String huruf) {
        switch (huruf) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
}
