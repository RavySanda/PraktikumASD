package jobsheet10;

public class AntrianLayanan {
    public Mahasiswa[] antrian;
    public int front;
    public int rear;
    public int size;
    public int max;


    
    public AntrianLayanan(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            antrian[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke dalam antrian.");
        }
    }

    public Mahasiswa panggilAntrian() {
        Mahasiswa mhs = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            mhs = antrian[front];
            size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return mhs;
    }

    public void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.println("\n--- Antrian Terdepan ---");
            System.out.println("NIM   : " + antrian[front].nim);
            System.out.println("Nama  : " + antrian[front].nama);
            System.out.println("Kelas : " + antrian[front].kelas);
            System.out.println("Absen : " + antrian[front].absen);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void LihatAkhir() {
        if (!isEmpty()) {
            System.out.println("\n--- Antrian Paling Belakang ---");
            System.out.println("NIM   : " + antrian[rear].nim);
            System.out.println("Nama  : " + antrian[rear].nama);
            System.out.println("Kelas : " + antrian[rear].kelas);
            System.out.println("Absen : " + antrian[rear].absen);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("\n=== DAFTAR SEMUA ANTRIAN MAHASISWA ===");
            int i = front;
            int nomor = 1;
            while (i != rear) {
                System.out.println(nomor + ". " + antrian[i].nama + " (" + antrian[i].nim + ") - Kelas: " + antrian[i].kelas);
                i = (i + 1) % max;
                nomor++;
            }
            System.out.println(nomor + ". " + antrian[i].nama + " (" + antrian[i].nim + ") - Kelas: " + antrian[i].kelas);
            System.out.println("Total jumlah mahasiswa dalam antrian: " + size);
        }
    }
}