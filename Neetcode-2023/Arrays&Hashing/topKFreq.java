import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// class Solution {

//     // public static Map<Integer, Integer> valueSort(final Map<Integer, Integer>
//     // map) {

//     // Comparator<Integer> valueComparator = new Comparator<Integer>() {

//     // public int compare(Integer k1, Integer k2) {

//     // int comp = map.get(k2).compareTo(map.get(k1));
//     // return comp==0 ? 1: comp ;

//     // }
//     // };

//     // // SortedMap created using the comparator
//     // Map<Integer, Integer> sorted = new TreeMap<Integer,
//     // Integer>(valueComparator);

//     // sorted.putAll(map);

//     // return sorted;
//     // }

//     // public int[] topKFrequent(int[] nums, int k) {

//     // // loop through array - create freqmap
//     // // sort it acc to values
//     // // slice and return the list of lenght k

//     // HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

//     // for (int i = 0; i < nums.length; i++) {
//     // frequencyMap.computeIfPresent(nums[i], (key, val) -> val + 1);
//     // frequencyMap.computeIfAbsent(nums[i], key -> 1);
//     // }

//     // Map sortedMap = valueSort(frequencyMap);

//     // int finalList[] = new int[k];

//     // Set<Object>set = sortedMap.keySet();
//     // int index=0;

//     // for (Object entry : set ){
//     // if(index >= k) break;
//     // finalList[index] = (Integer)entry;
//     // index++;
//     // }
//     // return finalList;

//     // }
//     // }

//     // class Solution {

//     public static Map<Integer, Integer> valueSort(final Map<Integer, Integer> map) {
//         // Static Method with return type Map and
//         // extending comparator class which compares values
//         // associated with two keys
//         Comparator<Integer> valueComparator = new Comparator<Integer>() {

//             public int compare(Integer k1, Integer k2) {

//                 int comp = map.get(k2).compareTo(map.get(k1));
//                 return comp == 0 ? 1 : comp;

//             }
//         };

//         // SortedMap created using the comparator
//         Map<Integer, Integer> sorted = new TreeMap<Integer, Integer>(valueComparator);

//         sorted.putAll(map);

//         return sorted;
//     }

//     public int[] topKFrequent(int[] nums, int k) {

//         // loop through array - get the most freq , second freques
//         // option- hashmap - key , freq
//         // loop through
//         // slice and return the list of lenght k

//         TreeMap<Integer, Integer> frequencyMap = new TreeMap<Integer, Integer>();

//         for (int i = 0; i < nums.length; i++) {
//             frequencyMap.computeIfPresent(nums[i], (key, val) -> val + 1);
//             frequencyMap.computeIfAbsent(nums[i], key -> 1);
//         }

//         System.out.println(frequencyMap);
//         Map sortedMap = valueSort(frequencyMap);
//         System.out.println(sortedMap);

//         int finalList[] = new int[k];
//         Set<Object> set = sortedMap.keySet();
//         int index = 0;

//         for (Object entry : set) {
//             if (index >= k)
//                 break;
//             finalList[index] = (Integer) entry;
//             index++;
//         }
//         return finalList;

//     }
// }

// // Get a set of the entries on the sorted map
// // List <Integer> list = new ArrayList<>(sortedMap.entrySet());

// // Collections.reverse(list);
// // System.out.println(list);

// // Get an iterator
// // Iterator i = set.iterator(set.size());
// // int noOfelements = 0 ;

// // // Display elements
// // while (i.hasPrevious() && noOfelements < k) {

// // Map.Entry mp = (Map.Entry) i.previous();
// // finalList[noOfelements] = (Integer)mp.getKey();
// // noOfelements++;
// // System.out.print(mp.getKey() + ": ");
// // System.out.println(mp.getValue());

// // }

// // for(int i = 0; i<k;i++){
// // finalList[i] = sortedMap.get();
// // }

// // HashMap<Integer,Integer> frequencyMap = new HashMap<>();

// // for(int i = 0; i<nums.length;i++){
// // frequencyMap.computeIfPresent(nums[i], (key, val) -> val + 1);
// // frequencyMap.computeIfAbsent(nums[i], key -> 1);
// // }

// // CustomIntegerComparator cmp =new CustomIntegerComparator(frequencyMap);
// // // System.out.println(cmp.map);

// // Queue<Integer> numsInFreqOrder = new PriorityQueue<>(cmp);

// // for(Map.Entry<Integer,Integer> mapEntry : frequencyMap.entrySet()){
// // // System.out.println(mapEntry.getKey());
// // numsInFreqOrder.add(mapEntry.getKey());
// // }

// // System.out.println(numsInFreqOrder);

// // int finalList[] = new int[k];
// // for(int i = 0; i<k;i++){
// // finalList[i] = numsInFreqOrder.poll();
// // }

// // return finalList;
// // }

// // }

// // class CustomIntegerComparator implements Comparator<Integer> {

// // HashMap<Integer, Integer> map = new HashMap<>();

// // CustomIntegerComparator(HashMap<Integer, Integer> freqMap) {

// // map = freqMap;
// // }

// // @Override
// // public int compare(Integer num1, Integer num2) {

// // // System.out.println("num1 "+ map.get(num1)+" num2 "+ map.get(num2));
// // // System.out.println();

// // return map.get(num1) > map.get(num2) ? num1 : num2;
// // }
// // }



class topKFrequent {

    class Node {
        int key;
        int count;

        public Node(int key, int count) {
            this.key = key;
            this.count = count;
        }
    }

    public int[] topKFrequen(int[] nums, int k) {
        
        /*
        // maintain hash with count ( somehow in order of most freq occurences )
        // how - linkedList 
        // iterate k times , remove and add to 

        // can i use - stack - 
        - PQ - with custom comparator , 
        TreeMap - 
        2 hmap 
        1 hmap , 1 treeMap 
        */

        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n2.count, n1.count);
            }
        });

        HashMap<Integer , Integer> map = new HashMap<>();
        

        for(int num : nums){
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer,Integer> mapEntry: map.entrySet()){
            queue.add(new Node(mapEntry.getKey(), mapEntry.getValue()));
        }

        int kFreq[] = new int[k];

        // It provides O(log(n)) time for add and poll methods . 
        for(int i=0;i<k;i++){
            kFreq[i]=queue.poll().key;
        }
            
        return kFreq;
        }

    
}

// 1-3 2-2 3-1
