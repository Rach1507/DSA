import java.util.HashMap;

public class Main {
  
    
    public static boolean solve(int N){

       String n= String.valueOf(N);
         HashMap<Character,Integer> hm=new HashMap<>();

       for (int i =0;i<n.length();i++){
           char I = n.charAt(i);

      
  if(hm.containsKey(I)){
               hm.put(I,hm.get(I)+1);
           }
           
           else{
               hm.put(I,1);
           }
       }









      for(  Character i :hm.keySet() )
      {

     
          if ((int) i != hm.get(i))
              return false;

      }
           

       
       return true;
       }


       

    
    public static void main(String[] args) {
        int N=10;

         int  i=1;
    while(true){
 if( solve(N+i)){
     System.out.println(N + i);
     break;
 }
            
        i=i+1;
    }
       

// def solve(N):
//     n=list(str(N))
//     d={}
//     for i in n:
//         if i in d:
//             d[i]+=1
//         else:
//             d[i]=1
//     for i in d:
//         if int(i)!=d[i]:
//             return False
//     return True
// def beautifulNumber (N):
//     i=1
//     while(True):
//         if solve(N+i):
//             return(N+i)
//         i=i+1












        // int value=0;
        // int a[]={1,1,1};
        // for(int  i=1;i<N;i++){
        //     for(int j=i+1;j<N;j++)
        //      for(int k=1;k<1000;k++)
        //      value= (int) (Math.pow(2,k)%1000000007 * (Math.ceil(a[i]/Math.pow(2,k))%2)%1000000007 * (Math.ceil(a[j]/Math.pow(2,k))%2)%1000000007);
        // }

        // System.out.println(value%1000000007);
    }
}
