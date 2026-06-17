package jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan batas maksimal kuota antrian: ");
        int kuota = scan.nextInt();
        scan.nextLine();

        AntrianLayanan akademis = new AntrianLayanan(kuota);
        int pilih;

        do {
            System.out.println("\n=== LAYANAN ANTRIAN SIAKAD ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (Proses)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Cetak Semua Antrian");
            System.out.println("5. Cek Kuota Penuh/Kosong");
            System.out.println("6. Cek Antrian Paling Belakang"); 
            System.out.println("7. Selesai");
            System.out.print("Pilih opsi (1-7): ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    if (akademis.isFull()) {
                        System.out.println("Maaf, kuota antrian hari ini sudah penuh!");
                        break;
                    }
                    System.out.print("NIM   : "); String nim = scan.nextLine();
                    System.out.print("Nama  : "); String nama = scan.nextLine();
                    System.out.print("Kelas : "); String kls = scan.nextLine();
                    System.out.print("Absen : "); int abs = scan.nextInt();
                    scan.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, kls, abs);
                    akademis.tambahAntrian(m);
                    break;
                case 2:
                    Mahasiswa diproses = akademis.panggilAntrian();
                    if (diproses != null) {
                        System.out.println("Sedang memproses dokumen Mahasiswa: " + diproses.nama);
                    }
                    break;
                case 3:
                    akademis.lihatTerdepan();
                    break;
                case 4:
                    akademis.cetakAntrian();
                    break;
                case 5:
                    System.out.println("Status Kosong: " + akademis.isEmpty());
                    System.out.println("Status Penuh  : " + akademis.isFull());
                    break;
                case 6:
                    akademis.LihatAkhir(); // Pemanggilan method perbaikan
                    break;
                case 7:
                    System.out.println("Program SIAKAD dihentikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 7);

        scan.close();
    }
}