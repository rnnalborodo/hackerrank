package hackerrank.tutorials.daysofCode.day26NestedLogic;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    final Scanner scan = new Scanner(System.in);
    int dateReturned = scan.nextInt();
    int monthReturned = scan.nextInt();
    int yearReturned = scan.nextInt();

    int dateExpected = scan.nextInt();
    int monthExpected = scan.nextInt();
    int yearExpected = scan.nextInt();
    scan.close();
    
    if(yearReturned < yearExpected)
      System.out.println("0");
    else
      System.out.println((yearReturned - yearExpected != 0) ? 10000
                       : (monthReturned - monthExpected > 0) ? (monthReturned -monthExpected ) * 500
                       : (dateReturned - dateExpected > 0) ? (dateReturned - dateExpected ) * 15
                       : 0); 


  }
}