package classesAndObjects;

import java.util.Scanner;

public class Car {

    // Attributes of the Car class
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the attributes
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

/*Java sees that you're concatenating a
string with an object, and it automatically calls: this.toString()
So it becomes, System.out.println("Car Details:\n" + this.toString());
 */
    public void displayCarDetails(){
        System.out.println("Car Details:\n" + this);
//        System.out.println("Car make: "+ make);
//        System.out.println("Car model: "+ model);
//        System.out.println("Car year: "+ year);
    }

    @Override
    public String toString(){
        return "Car make: "+ make + "\nCar model: "+ model+ "\nCar year: "+year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car make:");
        String make = sc.nextLine();

        System.out.println("Car model:");
        String model = sc.nextLine();

        System.out.println("Car year:");
        int year = sc.nextInt();

        Car car1 = new Car(make, model, year);

//      Car car2 =  new Car("Toyota", "Land Cruiser4", 2024);

        car1.displayCarDetails();
//        car1.toString();
//
//        car2.displayCarDetails();
//        car2.toString();
    }

}
