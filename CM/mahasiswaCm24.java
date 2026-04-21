package CM;

class mahasiswaCm24 {
 String nim , nama , prodi;

 mahasiswaCm24(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
void tampil() {
        System.out.println("NIM : " + nim + " | " + " Nama : " + nama + " | " + " Prodi :" + prodi);
    }
}