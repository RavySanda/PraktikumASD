package jobsheet10;

public class Queue {
    public int[] data;
    public int front;
    public int rear;
    public int size;
    public int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
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

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            dt = data[front];
            size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan.");
        } else {
            System.out.println("Queue sudah kosong.");
        }
    }
}