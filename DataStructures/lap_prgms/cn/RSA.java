import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class RSA {
     public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int p,q,n,z,d=0,e,i;
    System.out.println("Enter the number to be encrypted and decrypted");
    int msg=sc.nextInt();
    double c;
    BigInteger msgback; 
   //key generation
    System.out.println("Enter 1st prime number p");
    p=sc.nextInt();
    System.out.println("Enter 2nd prime number q");
    q=sc.nextInt();
     n=p*q;
    z=(p-1)*(q-1);
    System.out.println("the value of z = "+z); 
    
    for(e=2;e<z;e++)
    {
    if(gcd(e,z)==1)            // e is for public key exponent
    { e=7;
    break;
    }
    }
    System.out.println("the value of e = "+e); 
   // d= (((ϕ (n))*i) +1)/e 
    sc.close();
   for(i=0;i<=9;i++)
    {
    int x=1+(i*z);     
//     z=96 e=5
//    x=1+(4*96)  =385               
    if(x%e==0)      //d is for private key exponent
    {
    d=x/e;
    //  385/5=77
    break;
    }
    }
    System.out.println("the value of d = "+d); 
   //Encryption 
   c=(Math.pow(msg,e))%n;
    System.out.println("Encrypted message is : -");
    System.out.println(c);
   
   //Decryption 
   
                   //converting int value of n to BigInteger
    BigInteger N = BigInteger.valueOf(n);
    //converting float value of c to BigInteger
    BigInteger C = BigDecimal.valueOf(c).toBigInteger();
    msgback = (C.pow(d)).mod(N); // msgback= cdmod n
    System.out.println("Derypted message is : -");
    System.out.println(msgback);
    sc.close();
}
    
    static int gcd(int e, int z)  
    // e=5,z=96
    {
    if(e==0)
    return z; 
    else
    return gcd(z%e,e); 
//      96%5, 5    e=1, z=4
//    4%1, 1   e=0, z=1
   
//    5)96(19
//       5
//       46
//       45
//       01
   
    }

    
   
    
}
