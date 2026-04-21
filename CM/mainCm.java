package CM;
import java.util.Scanner;
public class mainCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data mahasiswaCm24
        mahasiswaCm24[] mhs = {
                new mahasiswaCm24("22001", "Andi", "Teknik Informatika"),
                new mahasiswaCm24("22002", "Budi", "Teknik Informatika"),
                new mahasiswaCm24("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Data bukuCm24
        bukuCm24[] buku = {
                new bukuCm24("B001", "Algoritma", 2020),
                new bukuCm24("B002", "Basis Data", 2019),
                new bukuCm24("B003", "Pemrograman", 2021),
                new bukuCm24("B004", "Fisika", 2024)
        };

        // Data peminjamanCm24
        peminjamanCm24[] pinjam = {
                new peminjamanCm24(mhs[0], buku[0], 7),
                new peminjamanCm24(mhs[1], buku[1], 3),
                new peminjamanCm24(mhs[2], buku[2], 10),
                new peminjamanCm24(mhs[2], buku[3], 6),
                new peminjamanCm24(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tampilkan buku");
            System.out.println("3. Tampilkan peminjaman");
            System.out.println("4. Urutkan berdasarkan denda ");
            System.out.println("5. Cari berdasarkan NIM ");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("\nDaftar Mahasiswa :");
                    for (mahasiswaCm24 m : mhs) {
                        m.tampil();
                    }
                    break;

                 case 2:
                    System.out.println("\nDaftar buku :");
                    for (bukuCm24 b : buku) {
                        b.tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nData peminjaman:");
                    for (peminjamanCm24 p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    // BUBBLE SORT
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                peminjamanCm24 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah diurutkan (denda terbesar):");
                    for (peminjamanCm24 p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.nextLine();

                    boolean ketemu = false;

                    // SEQUENTIAL SEARCH
                    for (peminjamanCm24 p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}
