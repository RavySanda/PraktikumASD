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

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        System.out.println("======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================================");

        // Input nilai
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + mk[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobot[i] = konversiBobot(nilaiHuruf[i]);
        }

        // Output tabel
        System.out.println("\n======================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);

            totalBobot += bobot[i];
        }

        double ip = totalBobot / mk.length;

        System.out.println("======================================");
        System.out.printf("IP : %.2f\n", ip);
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
