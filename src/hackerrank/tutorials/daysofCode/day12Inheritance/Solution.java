package hackerrank.tutorials.daysofCode.day12Inheritance;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for(int i=0; i < 6; i++){
      for(int j=0; j < 6; j++){
        arr[i][j] = in.nextInt();
      }
    }
    in.close();
    
    int hourglass = Integer.MIN_VALUE;
    for(int i=1; i < 5; i++){
      for(int j=1; j < 5; j++){
        int sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                  arr[i][j] + 
                  arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
        hourglass = Math.max(hourglass, sum);           
      }
    }
    System.out.println(hourglass);
  }
}
