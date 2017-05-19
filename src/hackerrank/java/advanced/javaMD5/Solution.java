package hackerrank.java.advanced.javaMD5;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args)  {
    /* Read and save the input String */
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    scan.close();

    try{
      /* Encode the String using SHA-256 */
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(str.getBytes());
      byte[] digest = md.digest();

      /* Print the encoded value in hexadecimal */
      for (byte b : digest) {
        System.out.format("%02x", b);
      }
    }catch (Exception e) {}
  }
}
