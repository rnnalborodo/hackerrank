package hackerrank.java.advanced.javaSHA256;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;


public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] bytes = md.digest(in.nextLine().getBytes());
      System.out.printf("%032x\n", new BigInteger(1,bytes));
    }
    catch ( Exception e ) {
    } finally {
      in.close();
    }
  }
}

