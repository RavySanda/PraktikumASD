public class Mahasiswa24 {
String nama;
String nim;
String kelas;
double ipk; 

void tampilkanInformasi () {
  System.out.println("Nama : " + nama);
  System.out.println("NIM : " + nim);
  System.out.println("IPK : " + ipk);
  System.out.println("Kelas : " + kelas);
}
void ubahKelas(String kelasBaru){
      kelas = kelasBaru;
}

void updateIpk(double ipkBaru){
        if(ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        }else {
            System.out.println("IPK tidak valid. Harus anatara 0.0 dan 4.0");       
        }
}

String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else if (ipk >= 2.0) {
            return "Kurang";
        } else {
            return "Sangat Kurang";
        }
    }
}


