public class DataDosenn24 {
    //  Menampilkan semua dosen
    public void dataSemuaDosen(Dosenn24[] arrayOfDosen) {
        for (Dosenn24 d : arrayOfDosen) {
            d.tampil();
        }
    }
    //  Jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosenn24[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosenn24 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-------------------------------------");
    }
    //  Rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosenn24[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosenn24 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                jmlPria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jmlWanita));

        System.out.println("-------------------------------------");
    }

    //  Dosen paling tua
    public void infoDosenPalingTua(Dosenn24[] arrayOfDosen) {
        Dosenn24 tertua = arrayOfDosen[0];

        for (Dosenn24 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampil();
    }

    //  Dosen paling muda
    public void infoDosenPalingMuda(Dosenn24[] arrayOfDosen) {
        Dosenn24 termuda = arrayOfDosen[0];

        for (Dosenn24 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampil();
    }
}