package jobsheet11;

public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 singLL = new SingleLinkedList24();

        
        singLL.addFirst(new Mahasiswa24("22212202", "Cintia", "3C", 3.5));
        singLL.addLast(new Mahasiswa24("23212201", "Bimon", "2B", 3.8));
        singLL.addFirst(new Mahasiswa24("21212203", "Anya", "4A", 3.7));

        
        singLL.insertAfter("22212202", new Mahasiswa24("22212205", "Deni", "3C", 3.2));
        singLL.insertAt(2, new Mahasiswa24("22212209", "Eka", "3A", 3.9));

        
        singLL.print();

       
        singLL.getData(1);
        System.out.println("--------------------");

       
        int index = singLL.indexOf("Bimon");
        if (index != -1) {
            System.out.println("data mahasiswa an Bimon berada pada index: " + index);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan");
        }
        System.out.println("--------------------");

        
        singLL.remove("Deni");
        singLL.remove("Eka");

        
        singLL.print();

        singLL.removeFirst();
        singLL.print();
    }
}