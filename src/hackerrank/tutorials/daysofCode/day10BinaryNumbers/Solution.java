package hackerrank.tutorials.daysofCode.day10BinaryNumbers;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    final Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    scan.close();
    int count = 0,
    max = 0;

    final String binary = Integer.toBinaryString(N);

    for (int i = 0 ; i < binary.length(); i++){
      if (binary.charAt(i)=='1')
        count++;
      else {
        max=Math.max(count, max);
        count=0;
      }
    }
    max=Math.max(count, max);
    System.out.println(max);
  }
}