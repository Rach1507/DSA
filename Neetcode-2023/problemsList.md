arrays

use Hashmap , use set
| Problem | brute force | clue/bottleneck for improvement | idea | moreOptimal | pattern | Link |
| :----------------: | :---------: | :-----------------: | :----------------------------------------------------------------------------------------------------: | :-----: | :-----: | ---- |
| Contains duplicate | | remember what u saw | so use hashmap | |HM | |
| Contains duplicate | | involves duplicates | so use set - compare set length and arr length | |SET | |
| 2 sum | 2 loops | two numbers add up to target | so use hashmap - what we need for target- curr is in hmap | | HM | |

Prefix sum -

|                         Problem                         |                                          brute force                                          |                                                       (bottle neck)                                                        |                                                                                                  idea                                                                                                  | link |
| :-----------------------------------------------------: | :-------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--: |
|                        Range Sum                        |                                                                                               | u are repeating computations , so have something precomputated , compute once , use it in next multple queries (o(1) time) |                                                                          use prefix arr , range_sum = sum[end] - sum[start-1]                                                                          |      |
| Prd of Arr expect self (in 0(n) , without division op ) | 2 loops , for every arr , skip curr upper loop index , compute and save prod of rest elements | u are repeating computations , so have something precomputated , compute once , use it in next multple queries (o(1) time) | product[curr] = prodof*left * prodof*right i.e product[curr] = prefix[i-1] * postfix[i+1], to compute from 1: prod*of_left = prefix[i-1] * nums[i-1] ,from n-2 : prod*of_rgt = prefix[i+1] * nums[i+1] |
|                 Prd of Arr expect self                  |                                                                                               |                           improve memory , we dont need 2 arr , ans is not considered extra mem                            |                         make 2 passes , first compute prefx as usual save into ans , then keep a var with postfix in track , mutiple postfix \* prefix store in ans in 2n pass                         |      |

String

|     Problem      |              brute force               |                                              (bottle neck)                                               |            idea             | link |
| :--------------: | :------------------------------------: | :------------------------------------------------------------------------------------------------------: | :-------------------------: | :--: |
|  Valid anagram   | convert to arr, sort , compare (nlogn) |                                         have char arr , ++ , --                                          | use arr - to remember chars |      |
| Valid palindrome |                                        | ignore non alphanumeric , if alphanumeric increament pointer , continue otherwise compare left and right |          2 pointer          |      |

Trees - https://www.interviewcake.com/concept/java/tree
pattern - https://www.youtube.com/watch?v=s2Yyk3qdy3o&ab_channel=Insidecode

|   Problem   |                                                         brute force                                                         | (bottle neck) |                                                    optimal                                                    |                                       pattern                                       | link | time taken |
| :---------: | :-------------------------------------------------------------------------------------------------------------------------: | :-----------: | :-----------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :--: | :--------: |
|   inOrder   |                                                                                                                             |               |                                                                                                               |                                                                                     |      |            |
|  max depth  | recursion , height of leftSubtree, then rightsubTree , then max of left , right = 1 + max (height of left , height of left) |               |                             not effective but other ways to solve - iterative dfs                             | recursion , solve for leftSubtree, then rightsubTree , then combine / iterative dfs |      |  10 mins   |
| level order |                                       bfs - iterative - to remember levels - used HM                                        |    memory     | bfs - iterative - with queue - for level - remembered length of children at each level , poll that many times |                                    iterative bfs                                    |      |  30 mins   |

tree if needed resources - https://www.youtube.com/watch?v=W8xT5SkuV3w&list=PL-Jc9J83PIiHYxUk8dSu2_G7MR1PaGXN4&index=3&ab_channel=Pepcoding
https://www.youtube.com/watch?v=fAAZixBzIAI&t=951s&ab_channel=freeCodeCamp.org
