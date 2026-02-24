public class DosenMain24 {
    public static void main(String[] args) {

        Dosen24 d1 = new Dosen24();
        d1.idDosen = "D24";
        d1.nama = "Pak Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "Pemrograman";

        Dosen24 d2 = new Dosen24(
                "D25",
                "Bu Sinta",
                true,
                2015,
                "Basis Data"
        );

        System.out.println("=== Dosen 1 ===");
        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        System.out.println("\n=== Dosen 2 ===");
        d2.tampilInformasi();
    }
}