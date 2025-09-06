package classesAndObjects;

import java.util.Scanner;

public class TwoLargestNumbers {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public TwoLargestNumbers(int firstNumber,int secondNumber,int thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public String firstLargest(){
        if(firstNumber >= secondNumber &&  firstNumber >= thirdNumber){
            return "First Largest: " + firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return  "First Largest: " + secondNumber;
        }else{
            return "First largest: " + thirdNumber;
        }
    }

    public String secondLargest(){
        int largest;
        int secondLargest;

        if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
            largest = firstNumber;
            secondLargest = Math.max(secondNumber, thirdNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
            secondLargest = Math.max(firstNumber, thirdNumber);
        }else{
            largest = thirdNumber;
            secondLargest = Math.max(firstNumber, secondNumber);
        }
        return "Second Largest: "+ secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st numbers:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter 2nd numbers:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter 3rd numbers:");
        int thirdNumber = scanner.nextInt();

        TwoLargestNumbers t1 = new TwoLargestNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println(t1.firstLargest());
        System.out.println(t1.secondLargest());
    }
}
