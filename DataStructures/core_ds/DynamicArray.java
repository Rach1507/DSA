import java.util.Iterator;

@SuppressWarnings("unchecked")

public class DynamicArray<T> implements Iterable<T> {
    private int len;
    private int capacity;
    private T arr[];

    public DynamicArray() {
        this(20);
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        this.len = 0;

    }

    public int size() {
        return this.len;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++)
            arr[i] = null;

        len = 0;

    }

    public boolean isEmpty() {
        return len == 0;
    }

    public T get(int index) {
        if (index >= len || index < 0)
            throw new IndexOutOfBoundsException();

        else
            return arr[index];

    }

    public void set(int index, T value) {
        if (index >= len || index < 0)
            throw new IndexOutOfBoundsException("Invalid index");

        else
            arr[index] = value;
    }

    
    public void add(T ele) {
        if (len + 1 >= capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;
        }
        arr[len++] = ele;

    }

    public T removeAt(int index)
    {  
        if(index<=len && index<0) throw new IndexOutOfBoundsException("invalid index");
        else
        {   T[] new_arr= (T[]) new Object[capacity];
            T removedEle = arr[index];
            for(int i =0, j=0;i<len;i++)
                if (removedEle == arr[i]) j--;
                else new_arr[j]=arr[i];
            arr=new_arr;
            capacity = --len;
            return removedEle;
    }
    }
    public void pop(){
        removeAt(len-1);
    }

    public void remove(Object ob)
    {
       
         if (contains(ob))
                removeAt(indexOf(ob));
        else throw new RuntimeException("Object not found");
        
    }
     public int indexOf(Object obj){
         for(int i =0;i<len;i++)
            if (arr[i] == (T)obj)
                return i;
    
    return -1;
     }

    public boolean contains(Object obj ){
        for ( int i =0;i< len;i++)
            if (arr[i] == (T)obj)
                return true;
    
    return false;
    }



    

    @Override
    public Iterator<T> iterator() {
       
        return new java.util.Iterator<T>() {
            int index = 0;
      
            @Override
            public boolean hasNext() {
              return index < len;
            }
      
            @Override
            public T next() {
              return arr[index++];
            }
      
            @Override
            public void remove() {
              throw new UnsupportedOperationException();
            }
          };
        }
    

        @Override
    public String toString() {

        if (len == 0) return "[]";

        StringBuilder str = new StringBuilder("[");
        for(int j=0;j<len;j++)
            str.append(arr[j]+",");
        str.append("]");

        return str.toString();
    }

public static void main(String args[]) {
    DynamicArray<Integer> arr = new DynamicArray<>();
    System.out.println(arr.isEmpty());
    System.out.println(arr.size());
    arr.add(9);
    arr.add(15);
    System.out.println(arr.toString());
    arr.clear();
    System.out.println(arr.toString());
    arr.add(7);
    arr.add(9);
    System.out.println(arr.toString());
    arr.removeAt(1);
    System.out.println(arr.toString());
    arr.remove(7);

    System.out.println(arr.toString());
    arr.removeAt(0);
    System.out.println(arr.toString());
}}

