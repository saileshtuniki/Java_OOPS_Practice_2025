package classesAndObjects;

import java.util.Scanner;

public class DisplayWord {


    public void displayLastDigitWord(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int lastDigit = number % 10;

        String[] digits = {"Zero","One","two","three","four","five","six","seven","eight","nine","ten"};
        System.out.println("Last digit word: "+ digits[lastDigit]);

    }

    public static void main(String[] args) {
        DisplayWord dw = new DisplayWord();
        dw.displayLastDigitWord();
    }
}


