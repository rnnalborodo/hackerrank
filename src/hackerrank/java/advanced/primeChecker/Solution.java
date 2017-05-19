package hackerrank.java.advanced.primeChecker;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime{
  public void checkPrime(int... nums){
    for(int i = 0; i < nums.length; i++){
      if (isPrime(nums[i]))
        System.out.format("%d ", nums[i]);

    }
    System.out.println();
  }

  private boolean isPrime(int n){
    if ((n == 2) )
      return true;
    else if ((n < 2) || (n%2 == 0))
      return false;
    else 
      for (int i = 3; i <= (int) Math.sqrt(n); i+=2){
        if (n % i == 0 )
          return false;
      }
    return true;
  }
}

public class Solution {

  public static void main(String[] args) {
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(in));
      int n1=Integer.parseInt(br.readLine());
      int n2=Integer.parseInt(br.readLine());
      int n3=Integer.parseInt(br.readLine());
      int n4=Integer.parseInt(br.readLine());
      int n5=Integer.parseInt(br.readLine());
      Prime ob=new Prime();
      ob.checkPrime(n1);
      ob.checkPrime(n1,n2);
      ob.checkPrime(n1,n2,n3);
      ob.checkPrime(n1,n2,n3,n4,n5);  
      Method[] methods=Prime.class.getDeclaredMethods();
      Set<String> set=new HashSet<>();
      boolean overload=false;
      for(int i=0;i<methods.length;i++)
      {
        if(set.contains(methods[i].getName()))
        {
          overload=true;
          break;
        }
        set.add(methods[i].getName());

      }
      if(overload)
      {
        throw new Exception("Overloading not allowed");
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }

}
