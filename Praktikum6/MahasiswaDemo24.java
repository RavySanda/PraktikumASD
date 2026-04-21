package Praktikum6;
import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
        list.listMhs = new Mahasiswa24[jumlah];

        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa24(nim, nama, kelas, ipk));
        }

        
        System.out.println("\n=== Data Mahasiswa ===");
        list.tampil();
    }
}
