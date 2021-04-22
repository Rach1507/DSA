import java.util.Collection;
import java.util.Collections;

public class StackbasedQueue {
    // java.util.Scanner sc = new java.util.Scanner(System.in);
    static void func(){
        java.util.Stack st= new java.util.Stack<>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true )
        {
            String choice=sc.nextLine();
        
        if(choice == "2")
            st.pop();
        if(choice == "3")
            System.out.println((int)Collections.max(st));
        else if(choice.substring(0,1) == "1")
            st.add(Integer.parseInt(choice.substring(2)));
        

    }}

    public static void main(String[] args) {
        func();
        Stack st= new Stack<>();
        static Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         while (n > 0)
         {
         String choice=sc.nextLine();
         
         if(choice == "2")
             st.pop();
         if(choice == "3")
             System.out.println((int)Collections.max(st));
         else if(choice.substring(0,1) == "1")
             st.add(Integer.parseInt(choice.substring(2)));
         n--;
         
         }
}
}