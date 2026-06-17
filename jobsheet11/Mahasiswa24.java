package jobsheet11;

public class Mahasiswa24 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa24() {
    }

    public Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}