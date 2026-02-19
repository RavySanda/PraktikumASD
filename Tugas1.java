import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] kode = {"A","B","D","E","F","G","H","L","N","T"};

        String[] kota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };
        while (true) {  

            System.out.print("\nMasukkan kode plat nomor: ");
            String input = sc.next().toUpperCase();

            boolean ketemu = false;

            for (int i = 0; i < kode.length; i++) {
                if (input.equals(kode[i])) {
                    System.out.println("Nama kota : " + kota[i]);
                    ketemu = true;
                    break;
                }
            }

            if (!ketemu) {
                System.out.println("Kode plat tidak ditemukan");
            }
        }
    }
}
