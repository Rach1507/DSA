// // Fundamental data types.
// ・Value: collection of objects.
// ・Operations: insert, remove, iterate, test if empty.
// ・Intent is clear when we insert.
// ・Which item do we remove?

// Stack. Examine the item most recently added.
// Queue. Examine the item least recently added.
// LIFO = "last in first out"
// FIFO = "first in first out"



// Stack is a one ended -linear data structure ehich supports 2 main operation , push and pop
//last in first out list 
// theres a pointer pointing on top , only top ele can be removed 
// applications:
        // 1) undo operation in text editor 
        // 2)Brackets in compiler design
        // 3) keep track of function calls in recursion
        // 4) call stack local variables
        // 5) model real world stacks
        // 6) games
        //7 ) dfs
            //8) Reverse sequence of strings from standard input.
            // Parsing in a compiler.
            // ・Java virtual machine.
            // ・Undo in a word processor.
            // ・Back button in a Web browser.
            // ・PostScript language for printers.
            // ・Implementing function calls in a compiler.



            // How a compiler implements a function.
            // ・Function call: push local environment and return address.
            // ・Return: pop return address and local environment.
            // Recursive function. Function that calls itself.
            // Note. Can always use an explicit stack to remove recursion.
            // evaluate infix expression            









import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Stack<T> implements Iterable<T>{

    LinkedList <T> stack_list=new LinkedList<T>();

    public  Stack() {}


    public  Stack(T data) {
        push(data);
        
    }

    public boolean isEmpty(){
        return stack_list.size() == 0;
    }
    public int size(){
        return stack_list.size();
    }

    public void push(T data){
        stack_list.addLast(data); 
        // stack_list.addFirst(data); if implemented using sll ,is the  key here ,  u cant traverse back so ,

    }
    public T pop(){
        if (isEmpty() )throw new EmptyStackException();//underflow
        else return stack_list.removeLast();
        //stack_list.removeFirst();  if implemented using sll ,is the  key here
    }

    public T peek() {
        if (isEmpty()) throw new java.util.EmptyStackException();
        return stack_list.peekLast();
      }

      public int search(T elem) {
        return list.lastIndexOf(elem);
      }

      
      
      
      @Override
      public java.util.Iterator<T> iterator() {
        return new stack_list.iterator();
 
      }
      
        }
      

}
