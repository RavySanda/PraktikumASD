package jobsheet9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kapasitas tumpukan surat izin: ");
        int kap = scan.nextInt();
        scan.nextLine(); 

        StackSurat prodiStack = new StackSurat(kap);
        int menu;

        do {
            System.out.println("\n=== MENU MANAJEMEN SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Validasi)");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            menu = scan.nextInt();
            scan.nextLine(); 

            switch (menu) {
                case 1:
                    if (prodiStack.isFull()) {
                        System.out.println("Gagal memasukkan data, tumpukan penuh!");
                        break;
                    }
                    System.out.print("ID Surat         : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas            : ");
                    String kls = scan.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jns = scan.next().charAt(0);
                    System.out.print("Durasi (Hari)    : ");
                    int dur = scan.nextInt();
                    scan.nextLine();

                    Surat inputSurat = new Surat(id, nama, kls, jns, dur);
                    prodiStack.push(inputSurat);
                    break;

                case 2:
                    Surat hasilProses = prodiStack.pop();
                    if (hasilProses != null) {
                        System.out.println("\n--> Surat Berhasil Diproses <--");
                        System.out.println("ID Surat     : " + hasilProses.idSurat);
                        System.out.println("Nama Mhs     : " + hasilProses.namaMahasiswa);
                        System.out.println("Status       : Selesai diverifikasi oleh Admin Prodi.");
                    }
                    break;

                case 3:
                    Surat cekTeratas = prodiStack.peek();
                    if (cekTeratas != null) {
                        System.out.println("\n--- Berkas Surat Posisi Teratas ---");
                        System.out.println("ID Surat     : " + cekTeratas.idSurat);
                        System.out.println("Nama Mhs     : " + cekTeratas.namaMahasiswa);
                        System.out.println("Jenis Izin   : " + cekTeratas.jenisIzin);
                        System.out.println("Durasi       : " + cekTeratas.durasi + " Hari");
                    }
                    break;

                case 4:
                    System.out.print("Ketik nama mahasiswa yang ingin dicari: ");
                    String searchKey = scan.nextLine();
                    prodiStack.cariSurat(searchKey);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 5);

        scan.close();
    }
}