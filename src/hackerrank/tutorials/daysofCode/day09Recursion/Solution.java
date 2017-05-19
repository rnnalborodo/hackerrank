package hackerrank.tutorials.daysofCode.day09Recursion;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
        scanner.close();
    }
  
  static int factorial(int i){
    if (i == 0)
      return 1;
    else
      return i * factorial(i-1);
  }
}