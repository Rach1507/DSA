import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    // https://leetcode.com/problems/3sum/solutions/5055810/video-two-pointer-solution/

    public List<List<Integer>> threeSumOptimal(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();


        Arrays.sort(nums);



        for (int i = 0; i < nums.length; i++) {

            // if we are not on second loop , 
            // to avoid duplicates - move pointer until we dont have same starting number 

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;        
    }
}
    
//     public List<List<Integer>> threeSum(int[] nums) {

//         Arrays.sort(nums);
//         LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();

//         for (int i = 0; i < nums.length - 2; i++) {
//             if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
//                 int target = 0 - nums[i];
//                 int leftPointer = i + 1;
//                 int rightPointer = nums.length-1;

//                 while(leftPointer < rightPointer){
//                     if(nums[leftPointer] + nums[rightPointer] == target){
//                         ArrayList<Integer> pair = new ArrayList<>();
//                         pair.add(nums[i]);
//                         pair.add(nums[leftPointer]);
//                         pair.add(nums[right]);
//                         sol.add(miniSol);
//                     }else if(numbers[leftPointer] + numbers[rightPointer] > target)
//                         rightPointer--;
//                     else
//                         leftPointer++;
//                 }

//             }
//         }

//         return sol;
//     }
// }


        // List<List<Integer>> finalResult = new ArrayList<>();

        // Arrays.sort(nums);

        // for(int k = 0 ; k < nums.length-2;k++){

        //     int target = 0 - nums[k];
        //     if(k > 0 && nums[k] == nums[k-1])continue;

        //     for(int i =k+1 ;i < nums.length;i++){
        //         if(nums[i] > 0 && nums[i] > target) break;
        //         else{
        //             int nextIndex = i+1;
        //             while(nextIndex < nums.length){
        //                 if(nums[i] +  nums[nextIndex] == target){ 
        //                     finalResult.add(new ArrayList<>(List.of(nums[k], nums[i],nums[nextIndex])));
        //                 }
        //                 nextIndex++;
        //             }
        //         }
        // }
        // }

    
        // List<List<Integer>> finalResult = new ArrayList<>();

        // HashSet<String> set = new HashSet<>();

        // for(int i = 0 ; i < nums.length;i++){
        
        //     for(int j = 0 ; j < nums.length;j++){
        //         if(i==j) continue;
        //         for(int k = 0 ; k < nums.length;k++){
        //             if(i==k || j==k) continue;
      
        //             if( nums[i] + nums[j] + nums[k] == 0){
                        
        //                 int[] triplet = new int[3];
        //                 triplet[0] = nums[i];
        //                 triplet[1] = nums[j];
        //                 triplet[2] = nums[k];

        //                 Arrays.sort(triplet);

        //                 List<Integer> intList = new ArrayList<Integer>(triplet.length);
        //                 for (int index : triplet)
        //                 {
        //                     intList.add(index);
        //                 }
                        
        //                 if(!set.contains(Arrays.toString(triplet))){
        //                     set.add(Arrays.toString(triplet));
        //                     finalResult.add(intList);
        //                 }

        //             }
        //         }
        //     }

        // }

    // return finalResult;
//     }
// }


        // List<List<Integer>> finalResult = new ArrayList<>();

        // Map<Integer,Integer> map=new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }

        // System.out.println(map);


        // int n=nums.length;
      
  
        // for(int j=0;j<n-1;j++){
           
            
        //     int subTarget = - (nums[j]);
        //     System.out.println(subTarget);
        //     for(int i=j;i<n;i++){
        //          List<Integer> result=new ArrayList<>();
        //         if(i!=j && map.containsKey(subTarget-nums[i])){
        //             result.add(nums[i]);
        //             result.add(nums[j]);
        //             result.add(subTarget-nums[i]);
        //             finalResult.add(result);
        //         }
        //     }
       
        // HashSet <List<Integer>> set = new HashSet<>(finalResult);

        // System.out.println(set);
        // }
        // return finalResult;

//     }
// }
































        // Arrays.sort(nums);
         // HashMap<Integer[], Integer> groupMap = new HashMap<>();
        // HashSet<Integer[]> set = new HashSet<>();
        // HashMap<List<Integer>, Integer> groupMap = new HashMap<>();
        





// Accepted answer


        // HashMap<Integer, Integer> map = new HashMap<>();
       
        // List<List<Integer>> finalList  = new ArrayList<>();
        // int first = 0,  third = 0, second = 0 ,thirdIndex =0 ;

        // for(int i = 0 ; i <nums.length ; i++){
        //     map.put(nums[i], i);
        // }
        

        // for (int i = 0 ;i <nums.length ; i++){
        //     first = nums[i];
        //     for (int j = 0 ; j < nums.length ; j++){
        //         second = nums[j];
        //         third = -(first + second);
        //         if(map.containsKey(third)){
        //             thirdIndex = map.get(third);
        //             if (thirdIndex != j && thirdIndex != i  && i!=j ){

        //                 // Integer[] list = {first , second , third};

        //             List<Integer> list = new ArrayList<>();
        //                      list.add(first);
        //                       list.add(second); 
        //                       list.add(third);
            
        //             // set.add(list);
        //             finalList.add(list);
        //             // groupMap.put(list , 0);


        //             }
        //         }
        //     }
        // }


//till here 

        
    // // for(Map.Entry<Integer[],Integer> mapEntry : groupMap.entrySet()){
    // //     System.out.println(mapEntry.getKey());

        
    // //     List<Integer> asList = Arrays.asList();
    // //     System.out.println(asList);
    // //     finalList.add(asList);
    // // }


    //    for(Integer[] group : set){
    //     System.out.println(group);

        
    //     List<Integer> asList = Arrays.asList(group);
    //     System.out.println(asList);
    //     finalList.add(asList);
    // }


 
//     return finalList;
//     }
// }