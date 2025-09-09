package classesAndObjects;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double cost;
    private int noOfBook;

    public Book(String title, String author, double cost, int noOfBook) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.noOfBook = noOfBook;
    }

    public void displayBooksData(){
        System.out.println("Book Details: ");
        System.out.println("-----------------------");
        System.out.println("Book Title: "+ title);
        System.out.println("Book author: "+ author);
        System.out.println("Book price: "+ cost);
        System.out.println("Book count: "+ noOfBook);
        System.out.println("-----------------------");
    }

    public boolean processPurchase(String requestedTitle, int requestedQuantity) {
        if (requestedTitle.equalsIgnoreCase(this.title)) {
            if (requestedQuantity <= this.noOfBook) {
                double totalCost = requestedQuantity * this.cost;
                System.out.println("Book available");
                System.out.println("Total cost for " + requestedQuantity + " copies: " + totalCost);
                return true;
            } else {
                System.out.println("Not enough copies available.");
                return true; // Book exists, but insufficient quantity
            }
        }
        return false; // Book title doesn't match
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Book[] books = {
                new Book("TrueLies", "Vivek", 199, 10),
                new Book("Evil amoung us", "criss", 99, 20),
                new Book("LoveAll", "sai", 250, 50)
        };

        //display the data
        for(Book b: books){
            b.displayBooksData();
        }

        System.out.println("CheckAvailability and Calculate:");
        System.out.print("Enter book title: ");
        String requestedTitle = sc.nextLine();


// First, check if the book exists
        Book foundBook = null;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(requestedTitle)) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found.");
            return;
        }

// Now ask for quantity only if book exists
        System.out.print("Enter quantity: ");
        int requestedQuantity = sc.nextInt();

// Call your method to process purchase
        foundBook.processPurchase(requestedTitle, requestedQuantity);


    }
}
