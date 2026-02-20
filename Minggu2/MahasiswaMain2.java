
public class MahasiswaMain2 {
    public static void main(String[] args) {
        
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "MUHAMMAD ALI";
        mhs1.nim = "254107020211";
        mhs1.kelas = "TI 1D";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 2C");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa24 mhsRavysandaaditya = 
        new Mahasiswa24("Ravy sanda aditya", "24001", 3.53, "TI 1C");

        mhsRavysandaaditya.tampilkanInformasi();
    }    
}
