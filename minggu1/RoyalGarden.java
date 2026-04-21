public class RoyalGarden {
        public static void main(String[] args) {
        int[][] stok = {//Setiap baris = cabang toko
                        //Setiap kolom = jenis bunga
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}

        };

        int[] harga = {75000, 50000, 60000, 10000};
        //Array ini menyimpan harga setiap jenis bunga.

        for (int i = 0; i < stok.length; i++) {
            //menghitung pendapatan setiap cabang toko RoyalGarden.
            //Karena ada 4 cabang, maka perulangan berjalan 4 kali.

            int pendapatan = hitungPendapatan(stok[i], harga);
            //memanggil method hitungPendapatan() untuk menghitung total pendapatan.

            System.out.println("RoyalGarden " + (i + 1));//Nama cabang
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println();
        }
    }

        static int hitungPendapatan(int[] stokCabang, int[] harga) {
        //menghitung total pendapatan dari satu cabang.
        //stokCabang → jumlah bunga di cabang
        //harga → harga bunga
        int total = 0;

        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * harga[i];//pendapatan = jumlah bunga × harga bunga
        }
        return total;
    }

        static String cekStatus(int pendapatan) {
        //menentukan status cabang berdasarkan pendapatan

        if (pendapatan > 1500000)
            return "Sangat Baik";
        else
            return "Perlu Evaluasi";
    }
}
