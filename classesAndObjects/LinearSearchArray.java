package classesAndObjects;

import java.util.Scanner;

public class LinearSearchArray {

    private int[] numbers;

    //constructor to initialize array with N elements
    public LinearSearchArray(int size){
        numbers = new int[size];
    }

    //method to accept the elements in arr
    public void acceptElements(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+ numbers.length + " size:");
        for(int i=0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
    }

    //method to display elements of arr
    public void displayElements(){
        System.out.println("Array elements are: ");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
    }

    //Method to perform linear search to find the given number
    public boolean linearSearch(int target){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == target){
                return true;
            }
        }
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        LinearSearchArray srchArr = new LinearSearchArray(n);

        //2.
        srchArr.acceptElements();
        //3.
        srchArr.displayElements();

        //4.
        System.out.println("Enter the number to Search: ");
        int target = sc.nextInt();
        if(srchArr.linearSearch(target)){
            System.out.println("Number "+ target +" is found in array:");
        }else{
            System.out.println("Number not found..!");
        }

        sc.close();
    }
}
