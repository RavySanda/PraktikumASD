package jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList24 dll = new DoubleLinkedList24();
        int menu;

        do {
            System.out.println("===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = scan.nextInt();
            scan.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("NIM   : "); String nim1 = scan.nextLine();
                    System.out.print("Nama  : "); String nama1 = scan.nextLine();
                    System.out.print("Kelas : "); String kls1 = scan.nextLine();
                    System.out.print("IPK   : "); Double ipk1 = scan.nextDouble();
                    dll.addFirst(new Mahasiswa24(nim1, nama1, kls1, ipk1));
                    break;

                case 2:
                    System.out.print("NIM   : "); String nim2 = scan.nextLine();
                    System.out.print("Nama  : "); String nama2 = scan.nextLine();
                    System.out.print("Kelas : "); String kls2 = scan.nextLine();
                    System.out.print("IPK   : "); Double ipk2 = scan.nextDouble();
                    dll.addLast(new Mahasiswa24(nim2, nama2, kls2, ipk2));
                    break;

                case 3:
                    System.out.print("Masukkan NIM acuan: ");
                    String keyNim = scan.nextLine();
                    System.out.print("NIM Baru   : "); String nim3 = scan.nextLine();
                    System.out.print("Nama Baru  : "); String nama3 = scan.nextLine();
                    System.out.print("Kelas Baru : "); String kls3 = scan.nextLine();
                    System.out.print("IPK Baru   : "); Double ipk3 = scan.nextDouble();
                    dll.insertAfter(keyNim, new Mahasiswa24(nim3, nama3, kls3, ipk3));
                    break;

                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    break;

                case 6:
                    dll.print();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (menu != 0);

        scan.close();
    }
}