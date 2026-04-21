package Praktikum6;

public class MahasiswaDemo24 {
    public static void main(String[] args) {

        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        list.tambah(new Mahasiswa24("001", "Andi", "TI-1A", 3.2));
        list.tambah(new Mahasiswa24("002", "Budi", "TI-1B", 3.5));
        list.tambah(new Mahasiswa24("003", "Citra", "TI-1A", 3.7));
        list.tambah(new Mahasiswa24("004", "Dina", "TI-1B", 3.9));
        list.tambah(new Mahasiswa24("005", "Eka", "TI-1A", 4.0));

        System.out.println("=== Data Mahasiswa ===");
        list.tampil();

        double cari = 3.7;

        //  SEQUENTIAL 
        System.out.println("=== Sequential Search ===");
        int posSeq = list.sequentialSearch(cari);
        list.tampilPosisi(cari, posSeq);
        list.tampilDataSearch(cari, posSeq);

        //  BINARY 
        System.out.println("=== Binary Search ===");
        int posBin = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        list.tampilPosisi(cari, posBin);
        list.tampilDataSearch(cari, posBin);
    }
}
