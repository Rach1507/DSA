import java.util.Iterator;

import javax.management.RuntimeErrorException;

@SuppressWarnings("unchecked")
public class QueueAsArray<T> implements Iterable<T> {

    T[] arr = (T[]) new Object[10];
    int head, tail = 0;
    private int capacity;

    public QueueAsArray() {
    }

    public QueueAsArray(T data) {
        enqueue(data);
    }

    void enqueue(T data) {
        if (isFull()) {
            capacity *= 2;
            T[] copy = (T[]) new Object[capacity];

            for (int i = head; i < tail; i++)
                copy[i] = arr[i];

            arr = copy;
        }

        arr[tail++] = data;

    }

    private boolean isFull() {
        return false;
    }

    T dequeue() {
        if (isEmpty())
            throw new RuntimeErrorException(null, "Queue Empty");

        T data = arr[head];
        arr[head] = null;
        head++;

        return data;
    }

    private boolean isEmpty() {
        return false;
    }

    public static void main(String[] args) {

    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}