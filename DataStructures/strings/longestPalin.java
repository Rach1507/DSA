

import java.util.Scanner;

public class longestPalin {

    public static void main (String[] args) {


        //brute force:Complexity:O(n^3)
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int ii = 0;ii<t; ii++)
        {   String str = sc.nextLine();
          
            int n= str.length();
           

           int maxLen=1;
            int start =0;
            for(int i =0;i<n;i++)
                for (int j=i;j<n;j++)
                  { 
                    int flag=1; 
                     for (int k = 0;k<((j-i+1)/2);k++)
                        if( str.charAt(k+i)!=str.charAt(j-k))
                           { 
                               flag = 0;
                                break;
           
                            }
                            
                      if (flag!=0 && (j-i+1)>maxLen)
                       { start=i;
                           maxLen=j-i+1;
                            
                        }
                  
                  
                }
                
                System.out.println(str.substring(start,maxLen+start-1));
        
        }
    }
    }
    

