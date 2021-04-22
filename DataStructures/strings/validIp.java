package strings;

import java.util.regex.Pattern;

public class validIp {
    public static boolean isValid(String s) {
        System.out.println(s.length());
        if(s.length() > 15)    return false;
        
        
            String classes[] =s.split("\\.");
            System.out.println(classes.length);
            if(classes.length !=4)    return false;
            
          for(int i =0;i<classes.length;i++)
          {    
            //    StringUtils.isNumeric(classes[i])
              int ipClass = Integer.parseInt(classes[i]);
              System.out.println(ipClass);
              if(ipClass < 0 && ipClass > 255)  return false;
          }
        
        
      return true;  
        // Write your code here
    }


    public static boolean isValidRegex(String s) {
        String zeroTo255 = "([0-9]|[1-9][0-9]|[1][0-9][0-9]|2[0-4][0-9]|25[0-5])";
        // String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    Pattern pattern = Pattern.compile(zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255);
    return pattern.matcher(s).matches();
    
    // Write your code here
}

public static void main(String[] args) {
    System.out.println(isValid("67.53.56.29"));
    System.out.println(isValidRegex("67.53.56.29"));
    System.out.println(isValidRegex("22.111.222.111"));
    // System.out.println(isValid("222..222.111"));
}
}
