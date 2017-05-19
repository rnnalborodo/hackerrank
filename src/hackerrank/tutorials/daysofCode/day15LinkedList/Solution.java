package hackerrank.tutorials.daysofCode.day15LinkedList;

import java.util.Scanner;

class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
  }
}

class Solution {

  private static Node tail = null;

  public static  Node insert(Node head,int data) {
    if(tail == null){
      tail = new Node(data);
      return tail;
    } else {
      Node aux = new Node(data);
      tail.next = aux;
      tail = aux;
      return head;
    }
  }



  public static void display(Node head) {
    Node start = head;
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
      int ele = sc.nextInt();
      head = insert(head,ele);
    }
    display(head);
    sc.close();
  }
}
