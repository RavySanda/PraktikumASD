package jobsheet9;

public class Surat {
    public String idSurat;
    public String namaMahasiswa;
    public String kelas;
    public char jenisIzin; 
    public int durasi;

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}