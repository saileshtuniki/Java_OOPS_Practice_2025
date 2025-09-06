package classesAndObjects;

public class Calculator {
    public int calculateSum(int num1, int num2){
        return  num1+ num2;
    }

    public int calDiff(int num1 , int num2){
        return num1 - num2;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum: " + cal.calculateSum(2,8));
        System.out.println("Difference: " + cal.calDiff(15,10));
    }
}
