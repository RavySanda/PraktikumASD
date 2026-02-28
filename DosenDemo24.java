import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosenn24[] arrayOfDosen = new Dosenn24[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("-------------------------------------");

            arrayOfDosen[i] = new Dosenn24(kode, nama, jenisKelamin, usia);
        }

        DataDosenn24 data = new DataDosenn24();

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("===== RATA-RATA USIA DOSEN PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}