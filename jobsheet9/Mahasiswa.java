package jobsheet9; // Sesuai dengan nama folder yang diinstruksikan

public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public int nilai;

    // Konstruktor berparameter
    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default sebelum dinilai
    }

    // Method untuk memberikan penilaian
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}