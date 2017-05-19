package hackerrank.tutorials.daysofCode.day28RegexPatterns;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();

    List<String> names = new LinkedList<String>();
    final String emailRegex = "[a-z]+@gmail.com";
    final Pattern p = Pattern.compile(emailRegex);

    for(int a0 = 0; a0 < N; a0++){
      String firstName = scan.next();
      String email = scan.next();

      if (p.matcher(email).find())
        names.add(firstName);
    }

    scan.close();

    Collections.sort(names);
    for (String e: names) {
      System.out.println(e);
    }
  }
}