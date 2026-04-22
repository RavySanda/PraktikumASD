public class MataKuliah24 {

    String kodematkul;
    String nama;
    int sks;
    int jumlahJam;
    //menyimpan data mata kuliah,

    // Konstruktor Default
    public MataKuliah24() {
    }

    
    // Konstruktor Berparameter
    public MataKuliah24(String kodematkul, String nama, int sks, int jumlahJam) {
        this.kodematkul = kodematkul;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK   : " + kodematkul);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jam tidak mencukupi.");
        }
    }
}