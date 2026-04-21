package Praktikum6;

public class MahasiswaBerprestasi24 {
    Mahasiswa24[] listMhs = new Mahasiswa24[5];
    int idx;
    void tambah(Mahasiswa24 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Mahasiswa24 m : listMhs) {
            m.tampilInformasi();
        }
    }

    //SEQUENTIAL SEARCH
    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // BINARY SEARCH
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;

            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan IPK " + x + " ditemukan di index " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Detail Mahasiswa:");
            listMhs[pos].tampilInformasi();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
