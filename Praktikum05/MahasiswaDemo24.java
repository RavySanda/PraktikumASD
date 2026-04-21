package Praktikum05;
import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < jml; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(m);
        }


        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut mrnggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut mrnggunakan INSERTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

    }
}

