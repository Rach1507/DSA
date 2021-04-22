import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicates {
        
           
        
        public static void main(String[] args) {

             int [] array = {1,2,3,4,6,7,4,5,5};

             ArrayList<Integer> list =new ArrayList<Integer>();

            //  Collections.addAll(list, array);


             for(int num:array) {
                list.add(num);
             }


             System.out.println(list);
           
             HashMap<Integer, Integer> CountMap = new HashMap<>();
     
             
     
             for (Integer i : list)
     
                 if (CountMap.containsKey(i)) 
                     CountMap.put(i, CountMap.get(i) + 1);
     
                 else
                     CountMap.put(i, 1);
                 
             
     
             for (Map.Entry entry : CountMap.entrySet()) {
                 if((int)entry.getValue()==2)
                  System.out.println(entry.getKey());
             }
            //  new int[100];
             
            // characterCount(given_str);
            // characterCount(arr);
        }
    }

