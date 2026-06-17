package jobsheet12;

public class Node24 {
    public Mahasiswa24 data;
    public Node24 prev;
    public Node24 next;

    public Node24(Node24 prev, Mahasiswa24 data, Node24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}