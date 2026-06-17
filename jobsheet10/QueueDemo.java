package jobsheet10;

import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = scan.nextInt();

        Queue Q = new Queue(n);
        int pilih;

        do {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Enqueue (Tambah Data)");
            System.out.println("2. Dequeue (Hapus/Ambil Data)");
            System.out.println("3. Print (Cetak Semua Data)");
            System.out.println("4. Peek (Lihat Elemen Terdepan)");
            System.out.println("5. Clear (Kosongkan Antrian)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataBaru = scan.nextInt();
                    Q.enqueue(dataBaru);
                    break;
                case 2:
                    int dataDihapus = Q.dequeue();
                    if (dataDihapus != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataDihapus);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 6);

        scan.close();
    }
    
}