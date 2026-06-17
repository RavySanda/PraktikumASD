package jobsheet11;

public class SingleLinkedList24 {
    public Node24 head;
    public Node24 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node24 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                System.out.println("--------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        Node24 temp = head;
        do {
            if (temp != null && temp.data.nim.equals(keyNim)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            if (temp != null) {
                temp = temp.next;
            }
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa24 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                Node24 ndInput = new Node24(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Indeks melebihi batas");
            }
        }
    }

    public void getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node24 tmp = head;
        for (int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            System.out.println("data index " + index + ":");
            tmp.data.tampilInformasi();
        } else {
            System.out.println("Indeks melebihi batas");
        }
    }

    public int indexOf(String keyNama) {
        if (isEmpty()) {
            return -1;
        }
        Node24 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(keyNama)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node24 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String keyNama) {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
            return;
        }
        if (head.data.nama.equalsIgnoreCase(keyNama)) {
            removeFirst();
        } else {
            Node24 temp = head;
            while (temp.next != null) {
                if (temp.next.data.nama.equalsIgnoreCase(keyNama)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
}