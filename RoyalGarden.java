public class RoyalGarden {

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungPendapatan(stok[i], harga);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println();
        }
    }

    static int hitungPendapatan(int[] stokCabang, int[] harga) {
        int total = 0;

        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * harga[i];
        }
        return total;
    }

    static String cekStatus(int pendapatan) {

        if (pendapatan > 1500000)
            return "Sangat Baik";
        else
            return "Perlu Evaluasi";
    }
}
