import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//     Syntax:

// public static void swap(List list, int i, int j)
// Parameters: This method takes the following argument as a Parameter

// list – The list in which to swap elements.
// i – the index of one element to be swapped.
// j – the index of the other element to be swapped.
// Exception This method throws IndexOutOfBoundsException, if either i or j is out of range (i = list.size() || j = list.size()).
    
public class swap {

    public static void main(String[] args) {

        // List <Integer> l = new ArrayList<Integer>();
        // l.add(1);
        // l.add(2);
        // l.add(5);
        // // l=[1,2,5]
        // Collections.swap(l,0,2);
        // System.out.println(l); 
        // //[5, 2, 1]
        // String c="Hello";

        // char[] ch_arr=c.toCharArray();
        String c="Hello";
        LinkedList<Character> list = new LinkedList<>();



        for( char ch:c.toCharArray()) {
            list.add(ch);
         }
 
        Character first =list.removeFirst();
        
        list.addLast(list.removeFirst());
        list.addLast(first);
        


        StringBuilder str =new StringBuilder();
        for (Character w : list) {
            str.append(w);
        }
        System.out.println(str.toString());










    }

}
