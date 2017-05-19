package hackerrank.java.dataStructures.javaPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Student implements Comparable<Student>{
  private int token;
  private String fname;
  private double cgpa;
  public Student(int id, String fname, double cgpa) {
    super();
    this.token = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
  public int getToken() {
    return token;
  }
  public String getFname() {
    return fname;
  }
  public double getCgpa() {
    return cgpa;
  }

  @Override
  public int compareTo (Student a){
    if(Math.abs(cgpa-a.getCgpa())>0.001){
      return cgpa < a.getCgpa()? 1:-1;
    }
    else if(!fname.equals(a.getFname())){
      return fname.compareTo(a.getFname());
    }
    else return token - a.getToken();
  }
}

public class Solution {

  protected static final Queue<Student> students = new PriorityQueue<>();

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int totalEvents = Integer.parseInt(in.nextLine());

    while(totalEvents>0){
      String event = in.next();

      if (event.equals("ENTER")){
        final String name = in.next();
        final double cgpa = in.nextDouble();
        final int token = in.nextInt();
        students.add(new Student(token, name, cgpa));
      } else { //SERVED
        students.poll();
      }

      totalEvents--;
    }
    in.close();

    // printing unserved students
    if (students.isEmpty())
      System.out.println("EMPTY");
    else 
      while(!students.isEmpty()){
        System.out.println(students.poll().getFname());
      }

  }
}
