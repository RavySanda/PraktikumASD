package jobsheet9;

public class StackSurat {
    private Surat[] data;
    private int size;
    private int top;

    public StackSurat(int size) {
        this.size = size;
        this.data = new Surat[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat srt) {
        if (!isFull()) {
            top++;
            data[top] = srt;
            System.out.println("Surat dengan ID " + srt.idSurat + " berhasil diterima.");
        } else {
            System.out.println("Tumpukan penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat srt = data[top];
            top--;
            return srt;
        } else {
            System.out.println("Tidak ada surat yang perlu diproses (Tumpukan Kosong).");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Tidak ada surat di dalam tumpukan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Tumpukan surat kosong.");
            return;
        }
        
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Ditemukan ---");
                System.out.println("ID Surat     : " + data[i].idSurat);
                System.out.println("Nama         : " + data[i].namaMahasiswa);
                System.out.println("Kelas        : " + data[i].kelas);
                System.out.println("Jenis Izin   : " + (data[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi       : " + data[i].durasi + " Hari");
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat atas nama '" + nama + "' tidak ditemukan.");
        }
    }
}