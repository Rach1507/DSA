import java.util.Arrays;

public class boat2sum {
    private static int pairCnt=0;

    public static void main(String[] args) {
            // int[] shipped = {0,0,0,0};


            int a[]={3,5,3,4};

            int[] shipped = new int[a.length];
       Arrays.fill(shipped, 0);

                // int a[]={1,2};
                // int a[]={3,2,2,1};

               
                int target=5;
                int a1=-1,a2=-1;


                for(int i=0;i<a.length;i++)
                {
                    if(shipped[i]==0)
                    {
                        int t=target-a[i];

                        if(t==0){ 
                        
                        
                            // System.out.println("["+a[i]+"]");
                            pairCnt++;
                            shipped[i]=1;
                            continue;
                        
                    
                    }


                    for(int l=i+1;l<a.length;l++)
                    {
                        if(t>=a[l])
                        {
                            if(shipped[l]==0)
                            {
                                a1=a[i];
                                a2=a[l];
                                pairCnt++;
                                shipped[i]=1;
                                shipped[l]=1;
                                // System.out.println("["+a1+","+a2+"]" );
                                break;
                        }

                        
                        }
                        
                    }
                    
                }

                }

                for(int j=0;j<shipped.length;j++)
                     { 
                          if(shipped[j]== 0)
                        {   if(shipped[j]<target)

                            // System.out.println("["+a[j]+"]");
                            pairCnt++;
                        }
                }

                // System.out.println("Pair "+pairCnt);
                System.out.println(pairCnt);
       
            }
        
        }
    