import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dosen24[] arrayOfDosen = new Dosen24[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true = Pria, false = Wanita) : ");
            Boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("-------------------------------------");

            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        // FOREACH untuk menampilkan data
        int no = 1;
        for (Dosen24 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            d.tampil();
            no++;
        }

        sc.close();
    }
}