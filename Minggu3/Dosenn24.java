public class Dosenn24 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    public Dosenn24(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia          : " + usia);
        System.out.println("-------------------------------------");

    }
}
