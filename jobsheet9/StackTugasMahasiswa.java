package jobsheet9;

public class StackTugasMahasiswa {
    public Mahasiswa[] stack;
    public int size;
    public int top;

    // Konstruktor untuk inisialisasi stack
    public StackTugasMahasiswa(int size) {
        this.size = size;
        this.stack = new Mahasiswa[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Tidak ada tugas di dalam tumpukan.");
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi stackKonv = new StackKonversi();
        
        if (nilai == 0) {
            return "0";
        }
        
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonv.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = "";
        while (!stackKonv.isEmpty()) {
            biner += stackKonv.pop();
        }
        
        return biner;
    }

   
    public Mahasiswa peekBottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    
    public int getJumlahTugas() {
        return top + 1;
    }
}