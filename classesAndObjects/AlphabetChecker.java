package classesAndObjects;

import java.util.Scanner;

public class AlphabetChecker {

    private char ch;

    public AlphabetChecker(char ch){
        this.ch = Character.toLowerCase(ch);
    }

    public void checkVowel(){
        if(!Character.isLetter(ch)){
            System.out.println(ch + "is not a valid alphabet letter");
        }else if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is a vowel");
        }else{
            System.out.println("is not a vowel");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.length() != 1){
            System.out.println("please enter exactly one character:");
            return;
        }
        char ch = input.charAt(0);

        AlphabetChecker a1 = new AlphabetChecker(ch);
        a1.checkVowel();
    }
}


