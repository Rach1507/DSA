class revDigits {
    /* Iterative function to reverse
    digits of num*/
    static int reversDigits(int n)
    {
        int rev=0;

        while(n >0){
            rev = (rev*10) + n%10;
            n /= 10;

        }


        // int rev_num = 0;
        // while (num > 0) {
        //     rev_num = rev_num * 10 + num % 10;
        //     num = num / 10;
        // }
        // return rev_num;
        return rev;

    }
 
    // Driver code
    public static void main(String[] args)
    {
        int num = 4562;
        // if given as a string
        // then convert to number by using Integer.parseInt
        System.out.println("Reverse of no. is "
                           + reversDigits(num));
    }
}