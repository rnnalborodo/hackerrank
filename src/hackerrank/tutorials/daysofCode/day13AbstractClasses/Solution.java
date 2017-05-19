package hackerrank.tutorials.daysofCode.day13AbstractClasses;

import java.util.Scanner;

abstract class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  abstract void display();
}

class MyBook extends Book{
  int price;

  /**   
   *   Class Constructor
   *   
   *   @param title The book's title.
   *   @param author The book's author.
   *   @param price The book's price.
   **/
  public MyBook(String ttl, String author, int _price ){
    super(ttl, author);
    this.price = _price;
  }

  /**   
   *   Method Name: display
   *   
   *   Print the title, author, and price in the specified format.
   **/
  public void display(){
    System.out.println(
        "Title: " + this.title
        + "\nAuthor: " + this.author
        + "\nPrice: " + this.price); 
  }
}

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String title = scanner.nextLine();
    String author = scanner.nextLine();
    int price = scanner.nextInt();
    scanner.close();

    Book book = new MyBook(title, author, price);
    book.display();
  }
}