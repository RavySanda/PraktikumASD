import java.util.Scanner; //

public class MatakuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //

        System.out.print("Masukkan jumlah elemen array matakuliah: ");
        int jumlahElemen = sc.nextInt();
        sc.nextLine(); 
        Matakuliah24[] arrayOfMatakuliah24 = new Matakuliah24[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine(); 

            arrayOfMatakuliah24[i] = new Matakuliah24();
            arrayOfMatakuliah24[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("---------------------------");
        }
        System.out.println("\n===== Daftar Matakuliah =====");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah24[i].cetakInfo();
        }
    }
}