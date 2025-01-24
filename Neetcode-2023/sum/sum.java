import java.util.HashMap;

public class sum {

    /*
     * ("abc def")
     * 
     *  
     * 
     * 
     * - ""
     */

    public static boolean isUnique(String str){

        if(str == null || str.length() == 0 ) return true ;

        char[] chArray = str.toCharArray();

        HashMap<Character , Integer > map = new HashMap<>();

       

        for(int i =0 ; i< str.length(); i++){
            if(map.containsKey(chArray[i])){
                return false;
            }else   map.put(chArray[i],i);
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique(""));
        System.out.println(isUnique(null));
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("aabc"));

    }



    
}



