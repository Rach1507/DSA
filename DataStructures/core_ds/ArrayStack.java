import java.util.EmptyStackException;
import java.util.Iterator;

//Hint: Use two stacks, one to store all of the items and a second stack to store the maximums.


public class ArrayStack implements Iterable<Integer> {

        private int[] ar;
        private int pos = 0;
        private int capacity=0;
        public ArrayStack()
        {  this(10);
        }
        // maxSize is the maximum number of items
        // that can be in the queue at any given time
        public ArrayStack(int maxSize) {
          ar = new int[maxSize];
          capacity=ar.length;
        }
      
        // Returns the number of elements insize the stack
        public int size() {
          return pos;
        }
      
        // Returns true/false on whether the stack is empty
        public boolean isEmpty() {
          return pos == 0;
        }
      
        // Returns the element at the top of the stack
       
        public Integer peek() {
            if(isEmpty()) throw new EmptyStackException();
          return ar[pos - 1];
        }
      
        // Add an element to the top of the stack
     
        public void push(Integer value) {
            if(pos ==capacity) {
                
                capacity *=2;
                int[]copy=new int[capacity];
                for(int i =0;i<pos;i++)
                    copy[i] = ar[i];
                ar=copy;
            }
          ar[pos++] = value;
        }
      
        // Make sure you check that the stack is not empty before calling pop!
     
        public Integer pop() {

          int data = ar[pos];
          
          pos--;
          return data;
        }

        public int  max(){
            int max=0;
            for (int ele : ar)
              if(ele>max)max= ele;
  
          return max;
        }

        @Override
    public Iterator<Integer> iterator() {
       
        return new java.util.Iterator<Integer>() {
            int index = 0;
      
            @Override
            public boolean hasNext() {
              return index < pos;
            }
      
            @Override
            public Integer next() {
              return ar[index++];
            }
      
            @Override
            public void remove() {
              throw new UnsupportedOperationException();
            }
          };
        }

public static void main(String[] args) {

            ArrayStack s = new ArrayStack();
        
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            
            System.out.println("max is " +s.max());
            System.out.println(s.pop()); // 5
            System.out.println(s.pop()); // 4
            System.out.println(s.pop()); // 3
        
            s.push(3);
            s.push(4);
            s.push(5);
        
            while (!s.isEmpty()) System.out.println(s.pop());

}}
