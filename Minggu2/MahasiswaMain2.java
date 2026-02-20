
public class MahasiswaMain2 {
    public static void main(String[] args) {
        
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "Ravy Sanda Aditya";
        mhs1.nim = "254107020211";
        mhs1.kelas = "TI 1D";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1C");
        mhs1.updateIpk(4.2);
        mhs1.tampilkanInformasi();
    }    
}
