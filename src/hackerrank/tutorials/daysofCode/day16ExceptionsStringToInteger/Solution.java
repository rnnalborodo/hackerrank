package hackerrank.tutorials.daysofCode.day16ExceptionsStringToInteger;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try{
      System.out.println(in.nextInt());
    }catch(Exception e){
      System.out.println("Bad String");
    }
  }
}