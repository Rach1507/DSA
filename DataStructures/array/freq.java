// class freq {
//     public static void main(String args[]) {

//         String given_str = "33456677";

//         char[] strArray = given_str.toCharArray();

//         int freq[] = new int[10];

//         for (int i = 0; i < 10; i++)
//             freq[i] = 0;

//         for (char c : strArray)
//             freq[(int) c - '0']++;

//         for (int i = 0; i < 10; i++)
//             if (freq[i] > 0)
//                 System.out.println(i + "  appears " + freq[i]);

//     }
// }





// class freq
// {
//     public static void main(String args[])
//     {
//         String str="33456677";
//         int n = Integer.parseInt(str);
 
//         int freq[]=new int[10]; 
 
//         for(int i=0; i<10; i++)
//             {
//                 freq[i]=0; 
 
//             }
 
 
//         int d;
//         while(n>0)
//         {
//             d=n%10; 
//             freq[d]++; 
//             n=n/10;
//         }
             
//         for(int i=0; i<10; i++)
//             {
//                 if(freq[i]!=0) 
//                     System.out.println("frequency of "+i+" is "+freq[i]);
//             }
//         }
//     }

public class freq {
    // public static void main(String[] args) {
    //     int [] arr= {2,3,4,5,6,5};
    //     Stack <Integer> peak= new Stack<Integer>();


    //     for (int i =0;i<arr.length;i++)
    //     {
    //         if(i==0)    if(arr[0]>arr[1])   peak.push(arr[0]);

    //         else if (i==arr.length-1) 
    //             {if(arr[arr.length-1]>arr[arr.length-2])
    //                  peak.push(arr[arr.length-1]);}


    //         else if((arr[i]>arr[i-1] ) && (arr[i]>arr[i-1]))
    //                 peak.push(arr[i]);


    //     }

    //     System.out.println(peak.toString());
    // }
}




// class freq {
//     static void characterCount(String given_str) {
        
//         HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

//         char[] strArray = given_str.toCharArray();

//         for (char c : strArray) {

//             if (charCountMap.containsKey(c)) 
//                 charCountMap.put(c, charCountMap.get(c) + 1);

//             else
//                 charCountMap.put(c, 1);
            
//         }
        
//         int maxValueInMap=(Collections.max(charCountMap.values()));

    

//         for (Map.Entry <Character, Integer> entry : charCountMap.entrySet()) {

//             if (entry.getValue()==maxValueInMap) {
//                 System.out.println(entry.getKey());
            
//         }

//         Map.Entry<Character, Integer> entryWithMaxValue = null;

//         if(entryWithMaxValue == null || entry.getValue().compareTo(entryWithMaxValue.getValue()) > 0) { 
  
//                 entryWithMaxValue = entry; 
//             } 
    
    
//     }
    
//     }
//     public static void main(String[] args) {
//         String str = "Aarabhi";
        
//         characterCount(str.toLowerCase());
//     }
// }

// String given_str = "33456677";
        // characterCount(given_str);
    // Integer maxValue=0;
    // Integer maxEntry = 0;
    // System.out.println(maxEntry.getKey());

        //   // This will return max value in the Hashmap
        // for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
        //         // Print the key with max value
            