public class Dossen24 {

    String idDossen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dossen24() {

    }

    // Konstruktor Berparameter
    public Dossen24(String idDosen, String nama, boolean statusAktif,
                   int tahunBergabung, String bidangKeahlian) {
        this.idDossen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDossen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void ubahStatusAktif(boolean status) {
    statusAktif = status;
    }
    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }
}