class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalResult = new ArrayList<>();

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        System.out.println(map);


        int n=nums.length;
      
  
        for(int j=0;j<n-1;j++){
           
            
            int subTarget = - (nums[j]);
            System.out.println(subTarget);
            for(int i=j;i<n;i++){
                 List<Integer> result=new ArrayList<>();
                if(i!=j && map.containsKey(subTarget-nums[i])){
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(subTarget-nums[i]);
                    finalResult.add(result);
                }
            }
       
        HashSet <List<Integer>> set = new HashSet<>(finalResult);

        System.out.println(set);
        }
        return finalResult;

    }
}
































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