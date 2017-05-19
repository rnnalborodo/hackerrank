package hackerrank.java.advanced.lambdaExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
  boolean check(int a);
}
class MyMath {
  public static boolean checker(PerformOperation p, int num) {
    return p.check(num);
  }

  //true if a number is odd or false if it is even.
  public PerformOperation is_odd(){
    return n-> (n%2 != 0);

  }
  //true if a number is prime or false if it is composite.
  public PerformOperation is_prime(){
    return n -> java.util.stream.IntStream.range(2, (int) Math.sqrt(n+1))
        .noneMatch(i -> n%i == 0);   
  }
  // true if a number is a palindrome or false if it is not.
  public PerformOperation is_palindrome(){
    return n -> java.util.stream.IntStream.iterate(n, e -> e/10 )
        .limit(11)
        .filter(f -> f>0)
        .map(e -> e%10)
        .reduce(0, (c,e)->c*10+e)
        == n;
  }
}

public class Solution {

  public static void main(String[] args) throws IOException {
    MyMath ob = new MyMath();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    PerformOperation op;
    boolean ret = false;
    String ans = null;
    while (T--> 0) {
      String s = br.readLine().trim();
      StringTokenizer st = new StringTokenizer(s);
      int ch = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      if (ch == 1) {
        op = ob.is_odd();
        ret = MyMath.checker(op, num);
        ans = (ret) ? "ODD" : "EVEN";
      } else if (ch == 2) {
        op = ob.is_prime();
        ret = MyMath.checker(op, num);
        ans = (ret) ? "PRIME" : "COMPOSITE";
      } else if (ch == 3) {
        op = ob.is_palindrome();
        ret = MyMath.checker(op, num);
        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

      }
      System.out.println(ans);
    }
  }
}