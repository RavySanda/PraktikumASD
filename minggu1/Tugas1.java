import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A','B','D','E','F','G','H','L','N','T'};
        //Array ini menyimpan kode awal plat nomor kendaraan.

        char[][] kota = {//array 2 dimensi yang menyimpan nama kota dari setiap kode plat.
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
            //Setiap indeks kode[i] berhubungan dengan kota[i].
        };

        while (true) { //Program akan terus berjalan tanpa berhenti

            System.out.print("\nMasukkan kode plat nomor: ");
            char input = sc.next().toUpperCase().charAt(0);
            //sc.next() → membaca input dari pengguna
            //toUpperCase() → mengubah huruf menjadi huruf besar
            // charAt(0) → mengambil huruf pertama

            boolean ketemu = false;//Menandai apakah kode plat ditemukan atau tidak.

            for (int i = 0; i < kode.length; i++) {
                //mencari kode plat dalam array kode.
                if (input == kode[i]) {
                    //Jika kode yang dimasukkan sama dengan salah satu kode dalam array,
                    //-maka program akan menampilkan nama kota.

                    System.out.print("Nama kota : ");
                    for (int j = 0; j < kota[i].length; j++) {
                        System.out.print(kota[i][j]);
                        //menampilkan huruf-huruf kota dari array 2 dimensi.
                    }
                    System.out.println();

                    ketemu = true;//menandakan kode ditemukan
                    break;//menghentikan perulangan pencarian
                }
            }

            if (!ketemu) {
                //ika kode tidak ada dalam array, program akan menampilkan
                System.out.println("Kode plat tidak ditemukan");
            }
        }
    }


    //Karena berupa array huruf, 
    // maka program harus mengambil huruf satu per satu menggunakan perulangan.
}
