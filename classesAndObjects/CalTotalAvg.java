package classesAndObjects;

import java.util.Scanner;

class Std2{
    private String name;
    private int m1,m2,m3;

    public Std2(String name, int m1, int m2, int m3){
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int calTotal(){
        return m1+m2+m3;
    }

    public double calAvg(){
        return (m1+m2+m3) / 3.0;
    }

    public void displayResult(){
        int total = calTotal();
        double avg = calAvg();

        System.out.println("Student name:"+ name);
        System.out.println("m1 marks:" + m1);
        System.out.println("m2 marks:" + m2);
        System.out.println("m3 marks:" + m3);

        System.out.println("total marks:"+total);
        System.out.println("Avg marks:"+avg);

    }

}
public class CalTotalAvg {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter m1 marks:");
        int m1 = sc.nextInt();
        System.out.println("Enter m2 marks:");
        int m2 = sc.nextInt();
        System.out.println("Enter m3 marks:");
        int m3 = sc.nextInt();
        Std2 s1 = new Std2(name, m1, m2, m3);
        s1.calTotal();
        s1.calAvg();
        s1.displayResult();

    }
}
