public class DossenMain24 {
    public static void main(String[] args) {
        // Objek dosen 1 menggunakan konstruktor default
        Dossen24 d1 = new Dossen24();
        d1.idDossen = "D24";
        d1.nama = "Pak Andi";
        d1.ubahStatusAktif(true);   // dosen menjadi aktif
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "Pemrograman";

        // Objek dosen 2 menggunakan konstruktor berparameter
        Dossen24 d2 = new Dossen24(
                "D25",
                "Bu Sinta",
                true,
                2015,
                "Basis Data"
        );

        // Menampilkan data dosen 1
        System.out.println("=== Dosen 1 ===");
        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        // Menampilkan data dosen 2
        System.out.println("\n=== Dosen 2 ===");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
    }
}