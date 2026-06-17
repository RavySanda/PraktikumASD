package jobsheet12;

public class DoubleLinkedList24 {
    public Node24 head;
    public Node24 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa24 item) {
        if (isEmpty()) {
            head = tail = new Node24(null, item, null);
        } else {
            Node24 newNode = new Node24(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa24 item) {
        if (isEmpty()) {
            head = tail = new Node24(null, item, null);
        } else {
            Node24 newNode = new Node24(tail, item, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa24 item) {
        if (isEmpty()) {
            System.out.println("List masih kosong!");
            return;
        }
        Node24 current = head;
        while (current != null) {
            if (current.data.nim.equals(keyNim)) {
                if (current == tail) {
                    addLast(item);
                } else {
                    Node24 newNode = new Node24(current, item, current.next);
                    current.next.prev = newNode;
                    current.next = newNode;
                }
                System.out.println("Data berhasil disisipkan.");
                return;
            }
            current = current.next;
        }
        System.out.println("NIM acuan '" + keyNim + "' tidak ditemukan!");
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak dapat menghapus data!");
            return;
        }
        System.out.println("Data milik " + head.data.nama + " berhasil dihapus.");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak dapat menghapus data!");
            return;
        }
        System.out.println("Data milik " + tail.data.nama + " berhasil dihapus.");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Double Linked List Kosong");
            return;
        }
        Node24 current = head;
        System.out.println("\n--- ISI DOUBLE LINKED LIST ---");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}