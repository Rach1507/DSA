import java.util.Scanner;
/*

Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)

Example 1:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3

 */
public class queueFromArray {
    public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			queueFromArray obj = new queueFromArray();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
                QueryType = sc.nextInt();


				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}
                
                else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}


				Q--;
			}
			System.out.println("");
			t--;
		 }
	}


        int front, rear;
        int arr[] = new int[100005];
    
        queueFromArray()
        {
            front=0;
            rear=0;
        }
    
        void push(int x)
        {
            if(rear+1 < arr.length)
            arr[rear++]=x;
            
        } 
    
        int pop()
        {
            if(front >= rear)
            return -1;
            
            else{
                
                 int popped = arr[front++];
                 return popped;
            }
           
          
        } 
    
    
}
