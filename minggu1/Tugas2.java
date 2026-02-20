import java.util.Scanner;

public class Tugas2{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int pilihan;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilSemua(jadwal, n);
                    break;
                case 2:
                    cariHari(jadwal, n);
                    break;
                case 3:
                    cariMatkul(jadwal, n);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);
    }

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=========== DAFTAR JADWAL =============");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, int n) {
        System.out.print("Masukkan hari yang dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cari)) {
                System.out.println("\nMata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void cariMatkul(String[][] jadwal, int n) {
        System.out.print("Masukkan nama mata kuliah: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cari)) {
                System.out.println("\nRuang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
