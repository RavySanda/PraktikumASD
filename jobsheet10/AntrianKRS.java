package jobsheet10;

public class AntrianKRS {
    public Mahasiswa[] dataKRS;
    public int front;
    public int rear;
    public int size;
    public int max;
    public int totalSudahKRS;

    public AntrianKRS() {
        max = 10; 
        dataKRS = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
        totalSudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void mengosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Seluruh antrian KRS berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian KRS penuh! Sila tunggu sesi berikutnya.");
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            dataKRS[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " terdaftar di antrian KRS.");
        }
    }


    public void panggilProsesKRS() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa di dalam antrian KRS!");
            return;
        }

        System.out.println("\n>>> PEMANGGILAN PROSES VERIFIKASI KRS BY DPA <<<");
        
        // Panggil mahasiswa pertama
        Mahasiswa mhs1 = dataKRS[front];
        size--;
        if (front == max - 1) {
            front = 0;
        } else {
            front++;
        }
        totalSudahKRS++;
        System.out.println("1. Sukses Verifikasi KRS -> Nama: " + mhs1.nama + " (" + mhs1.nim + ")");

       
        if (!isEmpty()) {
            Mahasiswa mhs2 = dataKRS[front];
            size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
            totalSudahKRS++;
            System.out.println("2. Sukses Verifikasi KRS -> Nama: " + mhs2.nama + " (" + mhs2.nim + ")");
        } else {
            System.out.println("(Pemberitahuan: Antrian habis, hanya 1 mahasiswa yang diproses pada panggilan ini)");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("\n--- DAFTAR ANTRIAN KRS SAAT INI ---");
            int i = front;
            int urutan = 1;
            while (i != rear) {
                System.out.println("Antrian ke-" + urutan + ": " + dataKRS[i].nama + " [" + dataKRS[i].nim + "]");
                i = (i + 1) % max;
                urutan++;
            }
            System.out.println("Antrian ke-" + urutan + ": " + dataKRS[i].nama + " [" + dataKRS[i].nim + "]");
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- 2 ANTRIAN TERDEPAN ---");
            System.out.println("1. " + dataKRS[front].nama + " (" + dataKRS[front].nim + ")");
            if (size > 1) {
                int indexKedua = (front + 1) % max;
                System.out.println("2. " + dataKRS[indexKedua].nama + " (" + dataKRS[indexKedua].nim + ")");
            } else {
                System.out.println("2. (Belum ada antrian kedua)");
            }
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- ANTRIAN PALING AKHIR ---");
            System.out.println("Nama : " + dataKRS[rear].nama + " (" + dataKRS[rear].nim + ")");
        }
    }

    public void cetakStatistik() {
        System.out.println("\n=== STATISTIK LAYANAN KRS ===");
        System.out.println("Jumlah mahasiswa mengantri saat ini : " + size + " anak");
        System.out.println("Jumlah mahasiswa sudah selesai KRS   : " + totalSudahKRS + " anak");
    }
}