package hackerrank.java.introduction.javaDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int month = in.nextInt() -1;
    int date = in.nextInt(); 
    int year = in.nextInt();

    Calendar cal = Calendar.getInstance();
    cal.set(year, month, date);
    System.out.println(
        new SimpleDateFormat("EEEE", Locale.ENGLISH).format(cal.getTime()).toUpperCase());

  }
}
