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

    public void checkBookExists(String BookName, int numberOfBooks){
        if(BookName.equals(title)  && numberOfBooks <= noOfBook){
            System.out.println("Book available");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b2 = new Book("TrueLies", "Vivek", 199, 10);
        Book b3 = new Book("Evil amoung us", "criss", 99, 20);
        Book b4 = new Book("LoveAll", "sai", 250, 50);

        b2.displayBooksData();
        b3.displayBooksData();
        b4.displayBooksData();

        //store books obj in array.
        Book[] books = {b2, b3, b4};

        System.out.println("Check book Exists.");
        System.out.println("Enter name of book:");
        String name = sc.nextLine();


        Book found = null;
        for(Book b: books){
            if(b.title.equalsIgnoreCase(name)){
                found = b;
                break;
            }
        }
        if(found == null) {
            System.out.println("Book not found");
            return;
        }

        System.out.println("Enter quantity of books:");
        int quantity = sc.nextInt();

        if(quantity <= found.noOfBook){
            double totalCost = quantity * found.cost;
            System.out.println("Total Cost of books: "+ totalCost);
        }else{
            System.out.println("Not enough copies available");
        }


    }
}
