package classesAndObjects;

public class LargestNumber {

    public String displayLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return "largest (int)= "+ a;
        } else if (b >= a && b >= c) {
            return "largest (int)= "+ b;
        } else {
            return "largest (int)= "+ c;
        }
    }

    public String displayLargest(float a, float b, float c){
        if (a >= b && a >= c) {
            return "largest (float)= " + a;
        } else if (b >= a && b >= c) {
            return "largest (float)= " + b;
        } else {
            return "largest (float)= " + c;
        }
    }

    public static void main(String[] args) {
        LargestNumber l1 = new LargestNumber();
        System.out.println(l1.displayLargest(100,3, 7));
        System.out.println(l1.displayLargest(2.0f,3.0f, 9.0f));

    }
}

