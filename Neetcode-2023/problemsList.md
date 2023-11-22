arrays

use Hashmap , use set
| Problem | brute force | clue/bottleneck for improvement | idea | moreOptimal | pattern | Link |
| :----------------: | :---------: | :-----------------: | :----------------------------------------------------------------------------------------------------: | :-----: | :-----: | ---- |
| Contains duplicate | | remember what u saw | so use hashmap | |HM | |
| Contains duplicate | | involves duplicates | so use set - compare set length and arr length | |SET | |
| 2 sum | 2 loops | two numbers add up to target | so use hashmap - what we need for target- curr is in hmap | | HM | |

Prefix sum -

|    Problem    |              brute force               |      (bottle neck)      |            idea             | link |
| :-----------: | :------------------------------------: | :---------------------: | :-------------------------: | :--: |
| Valid anagram | convert to arr, sort , compare (nlogn) | have char arr , ++ , -- | use arr - to remember chars |      |

String

|    Problem    |              brute force               |      (bottle neck)      |            idea             | link |
| :-----------: | :------------------------------------: | :---------------------: | :-------------------------: | :--: |
| Valid anagram | convert to arr, sort , compare (nlogn) | have char arr , ++ , -- | use arr - to remember chars |      |

Trees - https://www.interviewcake.com/concept/java/tree
pattern - https://www.youtube.com/watch?v=s2Yyk3qdy3o&ab_channel=Insidecode

|   Problem   |                                                         brute force                                                         | (bottle neck) |                                                    optimal                                                    |                                       pattern                                       | link | time taken |
| :---------: | :-------------------------------------------------------------------------------------------------------------------------: | :-----------: | :-----------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :--: | :--------: |
|   inOrder   |                                                                                                                             |               |                                                                                                               |                                                                                     |      |            |
|  max depth  | recursion , height of leftSubtree, then rightsubTree , then max of left , right = 1 + max (height of left , height of left) |               |                             not effective but other ways to solve - iterative dfs                             | recursion , solve for leftSubtree, then rightsubTree , then combine / iterative dfs |      |  10 mins   |
| level order |                                       bfs - iterative - to remember levels - used HM                                        |    memory     | bfs - iterative - with queue - for level - remembered length of children at each level , poll that many times |                                    iterative bfs                                    |      |  30 mins   |

tree if needed resources - https://www.youtube.com/watch?v=W8xT5SkuV3w&list=PL-Jc9J83PIiHYxUk8dSu2_G7MR1PaGXN4&index=3&ab_channel=Pepcoding
https://www.youtube.com/watch?v=fAAZixBzIAI&t=951s&ab_channel=freeCodeCamp.org
