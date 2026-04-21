public class MataKuliahMain24 {
    public static void main(String[] args) {

        MataKuliah24 mk1 = new MataKuliah24();
        mk1.kodematkul = "ASD24";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        
        MataKuliah24 mk2 = new MataKuliah24(
                "BD24",
                "Basis Data",
                2,
                4
        );

        System.out.println("=== Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\n=== Mata Kuliah 2 ===");
        mk2.tampilInformasi();
    }
}uat program menyimpan data produk

nama    harga  stok24  
beras   75000   23
gula
