package jobsheet10;

import java.util.Scanner;

public class KRS_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianKRS antrianKrs = new AntrianKRS();
        int opsi;

        
        do {
            System.out.println("\n======= SISTEM ANTRIAN KRS MAHASISWA =======");
            System.out.println("1. Tambah Antrian Mahasiswa (Masuk)");
            System.out.println("2. Panggil Antrian KRS (Proses 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Statistik Jumlah Antrian & Berhasil KRS");
            System.out.println("7. Kosongkan Seluruh Antrian");
            System.out.println("8. Selesai");
            System.out.print("Masukkan pilihan Anda: ");
            opsi = input.nextInt();
            input.nextLine();

            switch (opsi) {
                case 1:
                    if (antrianKrs.isFull()) {
                        System.out.println("Antrian sudah penuh (Maksimal 10)!");
                        break;
                    }
                    System.out.print("NIM         : "); String nim = input.nextLine();
                    System.out.print("Nama        : "); String nama = input.nextLine();
                    System.out.print("Kelas       : "); String kls = input.nextLine();
                    System.out.print("No. Absen   : "); int abs = input.nextInt();
                    input.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, kls, abs);
                    antrianKrs.tambahAntrian(m);
                    break;
                case 2:
                    antrianKrs.panggilProsesKRS();
                    break;
                case 3:
                    antrianKrs.tampilkanSemua();
                    break;
                case 4:
                    antrianKrs.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKrs.tampilkanPalingAkhir();
                    break;
                case 6:
                    antrianKrs.cetakStatistik();
                    break;
                case 7:
                    antrianKrs.mengosongkanAntrian();
                    break;
                case 8:
                    System.out.println("Aplikasi Manajemen Antrian KRS ditutup.");
                    break;
                default:
                    System.out.println("Menu tidak ada! Silakan input ulang.");
            }
        } while (opsi != 8);

        input.close();
    }
}