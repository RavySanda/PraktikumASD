package jobsheet9; 

public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public int nilai;

    
    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}