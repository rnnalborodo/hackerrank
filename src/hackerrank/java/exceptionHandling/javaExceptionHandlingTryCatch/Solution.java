package hackerrank.java.exceptionHandling.javaExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try{
      final int fst = in.nextInt();
      final int snd = in.nextInt();
      System.out.println(Math.round(fst/snd));
    } catch (InputMismatchException ex ){
      System.out.println("java.util.InputMismatchException");
    } catch (ArithmeticException ex ){
      System.out.println("java.lang.ArithmeticException: / by zero");
    } catch (Exception ex ){
    }
  }
}