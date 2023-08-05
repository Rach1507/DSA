class Solution {
       
       public int[] topKFrequent(int[] nums, int k) {
   
           //loop through array - get the most freq , second freques
           //option- hashmap - key , freq 
           //loop through 
           // slice and return the list of lenght k
   
           HashMap<Integer,Integer> frequencyMap = new HashMap<>();  
   
           for(int i = 0; i<nums.length;i++){
               frequencyMap.computeIfPresent(nums[i], (key, val) -> val + 1);
               frequencyMap.computeIfAbsent(nums[i], key -> 1);
           }
   
           CustomIntegerComparator cmp =new CustomIntegerComparator(frequencyMap);
           // System.out.println(cmp.map);
   
           Queue<Integer> numsInFreqOrder = new PriorityQueue<>(cmp);
   
   
           for(Map.Entry<Integer,Integer> mapEntry : frequencyMap.entrySet()){
               // System.out.println(mapEntry.getKey());
               numsInFreqOrder.add(mapEntry.getKey());
           }
   
               System.out.println(numsInFreqOrder);
   
           int finalList[] = new int[k];
             for(int i = 0; i<k;i++){
                 finalList[i] = numsInFreqOrder.poll();
             }
   
           return finalList;
       }



       public static <K, V extends Comparable<V> > Map<K, V>
       valueSort(final Map<K, V> map)
       {
           // Static Method with return type Map and
           // extending comparator class which compares values
           // associated with two keys
           Comparator<K> valueComparator = new Comparator<K>()
           {
                 
               public int compare(K k1, K k2)
               {
     
                   int comp = map.get(k1).compareTo(map.get(k2));
     
                   if (comp == 0)
                        return 1;
     
                   else
                        return comp;
               }
           };
     
           // SortedMap created using the comparator
           Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
     
           sorted.putAll(map);
     
           return sorted;
       }
   
   }
   
        class CustomIntegerComparator implements Comparator<Integer> {
   
           HashMap<Integer,Integer> map = new HashMap<>();  
   
           CustomIntegerComparator(HashMap<Integer,Integer>freqMap) {
   
                   map = freqMap ;  
           }
   
           @Override
           public int compare(Integer num1, Integer num2 ) {
   
               //    System.out.println("num1 "+ map.get(num1)+" num2 "+ map.get(num2));
               //    System.out.println();
   
               return map.get(num1) > map.get(num2)  ? num1 : num2;
           }
       }
   