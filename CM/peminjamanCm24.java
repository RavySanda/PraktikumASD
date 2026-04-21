package CM;

public class peminjamanCm24 {
    mahasiswaCm24 mhs;
    bukuCm24 buku;
    int lamaPinjam, denda, telat ;

    peminjamanCm24(mahasiswaCm24 mhs, bukuCm24 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        telat = lamaPinjam - batas;

        if (telat > 0) {
            denda = telat * 2000;
        } else {
            telat = 0;
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nama + " | " + buku.judul +
                " | " + " Lama : " + lamaPinjam + " | " + "Terlambat :" + telat +  " | " +  "Denda: " + denda);
    }
}
