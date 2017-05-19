package hackerrank.tutorials.daysofCode.day112DArrays;

import java.util.Scanner;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  // Constructor
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  // Print person data
  public void printPerson(){
    System.out.println(
        "Name: " + lastName + ", " + firstName 
        +   "\nID: " + idNumber); 
  }

}

class Student extends Person{
  private int[] testScores;

  /*  
   *   Class Constructor
   *   
   *   @param firstName - A string denoting the Person's first name.
   *   @param lastName - A string denoting the Person's last name.
   *   @param id - An integer denoting the Person's ID number.
   *   @param scores - An array of integers denoting the Person's test scores.
   */
  // Write your constructor here
  public Student(String fn, String ln, int id, int[] scrs){
    super(fn, ln, id);
    testScores = new int[scrs.length];
    System.arraycopy( scrs, 0, testScores, 0, scrs.length );
  }

  /*  
   *   Method Name: calculate
   *   @return A character denoting the grade.
   */
  public char calculate(){
    int avg = 0;
    for (int i = 0; i < testScores.length; i++){
      avg+= testScores[i];      
    }
    avg/=testScores.length;

    if (avg < 40)
      return 'T';
    else if (avg >= 40 && avg < 55)
      return 'D';
    else if (avg >= 55 && avg < 70)
      return 'P';
    else if (avg >= 70 && avg < 80)
      return 'A';
    else if (avg >= 80 && avg < 90)
      return 'E';
    else //if (avg >= 90 && avg <= 100)
      return 'O';

  }

}

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate() );
  }
}