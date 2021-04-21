package com.tts;

public class Book {

    String title;
    boolean borrowed;

    public Book() {
    }
    public Book(String title, boolean borrowed) {
        this.title = title;
        this.borrowed = borrowed;
    }
    public String toString() {
        return "Book{title='" + this.title + "', borrowed=" + this.borrowed + "}";
    }

    // Creates a new Book
    public Book(String bookTitle) {
      title = bookTitle;
      this.borrowed = false;
    }

    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] args) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title : " + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }
}