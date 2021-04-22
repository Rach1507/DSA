import java.util.Arrays;

public class majorityEle {

    static int majorityElement(int a[], int size)
    {
        java.util.HashMap<Integer, Integer> CountMap = new java.util.HashMap<Integer, Integer>();

        for (int i : a) {

            if (CountMap.containsKey(i)) 
                CountMap.put(i, CountMap.get(i) + 1);
                    
            else
                CountMap.put(i, 1);
                
            if (CountMap.get(i) > size/2)
                    return i;
            
        }
        
        return -1;
    }
      
        // java.util.HashMap<Integer, Integer> CountMap = new java.util.HashMap<Integer, Integer>();

        // for (int i : a) {

        //     if (CountMap.containsKey(i)) {
                
        //         int count = CountMap.get(i) + 1;
               
        //          if ( count > size/2)
        //             return i;
        //          else
        //             CountMap.put(i, count);
        //     }
                    
        //     else
        //         CountMap.put(i, 1);
                
        // }
        
        // return -1
        public static int majorityElem(int[] arr, int n)
        {
            
            // Sort the array in O(nlogn)
            Arrays.sort(arr);
        
            int count = 1, max_ele = -1, 
                 temp = arr[0], ele = 0,
                    f = 0;
        
            for(int i = 1; i < n; i++)
            {
                
                // Increases the count if the 
                // same element occurs otherwise
                // starts counting new element
                if (temp == arr[i])
                {
                    count++;
                }
                else 
                {
                    count = 1;
                    temp = arr[i];
                }
        
                // Sets maximum count and stores
                // maximum occured element so far
                // if maximum count becomes greater
                // than n/2 it breaks out setting
                // the flag
                if (max_ele < count) 
                {
                    max_ele = count;
                    ele = arr[i];
        
                    if (max_ele > (n / 2)) 
                    {
                        f = 1;
                        break;
                    }
                }
            }
        
            // Returns maximum occured element
            // if there is no such element, returns -1
            return (f == 1 ? ele : -1);
        }

public static void main(String[] args)
{
    int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
    int n = 7;

    System.out.println(majorityElement(arr, n));
    System.out.println(majorityElem(arr, n));
}

}
