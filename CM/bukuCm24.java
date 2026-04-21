package CM;

public class bukuCm24 {
    String kode, judul;
    int tahun;

    bukuCm24(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Kode : " + kode + " | " + " Judul : "  + judul + " | " + "Tahun :"+ tahun);
    }
}
