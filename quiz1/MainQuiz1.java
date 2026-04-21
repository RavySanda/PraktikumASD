package quiz1;
public class MainQuiz1 {
    public static void main(String[] args) {

        quiz24 barang1 = new quiz24();

        // mengisi data
        barang1.nama24 = "gula";
        barang1.harga24 = 75000 ;
        barang1.stok24 = 23;
        barang1.diskon24 = 0.5;

        barang1.tampilInformasi24();

        // menghitung diskon
        barang1.updateIpk(barang1.diskon24);

        System.out.println("Harga setelah diskon: " + barang1.hargaDiskon);
    }
}