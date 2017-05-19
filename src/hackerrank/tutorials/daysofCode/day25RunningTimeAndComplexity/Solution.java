package hackerrank.tutorials.daysofCode.day25RunningTimeAndComplexity;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    final Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    for (int j = 0; j < N; j++) {
      int m = scan.nextInt();
      System.out.println(
          (isPrime(m))? "Prime":"Not Prime");
    }
    scan.close();
  }


  private static boolean isPrime(int n) {
    if (n == 2) { 
      return true;
    }

    if (n % 2 == 0 || n == 1) {
      return false;
    }
    
    int sqrtNum = (int) Math.sqrt(n);
    for (int i = 3; i <= sqrtNum; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}