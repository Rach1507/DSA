import java.util.Arrays;

public class longestCharReplace {


        public static int characterReplacement(String s, int k) {
        
           
     
          if(k >= s.length()) return s.length();
        
    
        int[] map = new int[26];
         Arrays.fill(map,0);   
        
        int window_size = s.length();
         
        for(int i =0;i<window_size;i++)
                     map[s.charAt(i)-'A']++;
       
       
       
        
    
        
       while(window_size > k){
           int start = 0, end = window_size - 1;
           if(window_size<s.length())
           map[s.charAt(window_size)-'A']--;
        
          while(end<s.length()){
                    
    
       int max =0;
               for(int i =start;i<=end;i++){
                   if(map[s.charAt(i)-'A']>max)
                         max=map[s.charAt(i)-'A'];
               }
                     
              
              
              
            

              if(window_size-max <= k) return window_size;
              
              else{
                 end++;
                  if(end<s.length()){
                  map[s.charAt(end)-'A']++;
                  map[s.charAt(start)-'A']--;
                  start++;  
              }
             
             }
          }
        
           window_size--;   
              
          }

          
        return k+1;
    }
        
        
    
        
        
     public static void main(String[] args) {
         System.out.println(characterReplacement("ABCDE",1));
     }   
    

}
