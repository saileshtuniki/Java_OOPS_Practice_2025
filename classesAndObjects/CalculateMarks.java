package classesAndObjects;

import java.util.Scanner;

class Std1 {
    String name;
    int mark1, mark2,mark3;


    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter mark1:");
        mark1 = sc.nextInt();
        System.out.println("Enter mark2:");
        mark2 = sc.nextInt();
        System.out.println("Enter mark3:");
        mark3 = sc.nextInt();

    }


    void display() {
        System.out.println(mark1 + mark2 + mark3);
        int total = mark1 + mark2 + mark3;
        System.out.println("total: " + total);

        double avg = total / 3.0;
        System.out.println("average: " + avg);
    }
}


    public class CalculateMarks{
        public static void main(String[] args) {
            Std1 c1 = new Std1();
            c1.acceptDetails();
            c1.display();
        }
    }
