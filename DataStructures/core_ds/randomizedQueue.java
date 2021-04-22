import java.util.Iterator;

public class randomizedQueue<T> implements Iterable<T> {
        public randomizedQueue(){} // construct an empty randomized queue
        public boolean isEmpty(){
            return size() == 0;
        } // is the queue empty?
        public int size(){
            return length;
        } // return the number of items on the queue
        public void enqueue(T item) {}// add the item
        public T dequeue(){
            return null;
        } // remove and return a random item
        public T sample() {
            return null;
        }// return (but do not remove) a random item
        public Iterator<T> iterator(){
            return null;
        } // return an independent iterator over items in random order
        public static void main(String[] args) {}  // unit testing
    }

