public class Solution {
    public int calPoints(String[] operations) {

        int sum = 0 ; 
        Stack<Integer> recs = new Stack<>();

        for(int i =0 ;i < operations.length;i++){

            String currOp = operations[i];

                if(currOp.equals("+")) {
                      int num = 0 , sumOf2= 0; 
                      if(recs.size() < 2)return 0;

                      for (int j = recs.size() - 1; j >= recs.size() - 2 ; j--) {
                        sumOf2 += recs.get(j); 
                    }
                    recs.push(sumOf2);
                    sum += recs.peek();
                } 
                else if(currOp.equals("D")) { 
                    recs.push(2 * recs.peek());
                    sum += recs.peek();
                }
                else if(currOp.equals("C")){
                    int lastOp = recs.pop();
                    sum -= lastOp;
                }
                else{
                    recs.push(Integer.parseInt(operations[i]));
                    sum += recs.peek();
                }
        }


        // Iterator it = recs.listIterator();
        //  while (it.hasNext()) { 
        //     int next = (int)it.next();
        //     // System.out.println(next+"\t"); 
        //     sum += next; 
        // } 

        return sum;
        
    }
}



                    
                // int score1 = Interger.parseInt(recs.pop());
                // int score2 = Interger.parseInt(history.pop());
                // if(typeOf(score1) == Integer && typeOf(score2) == Integer)
                //     recs.push();
                //     sum += score1 + score2 {
    
}
