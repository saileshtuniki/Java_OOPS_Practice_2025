package classesAndObjects;

public class SeriesCalculator {


    public int calculateSum(int n){
        int a =1;
        int d =2;

//        return (n/2)*(2*a+(n-1)*d);
        return n * a +(n*(n-1) *d)/2;
    }
    public static void main(String[] args) {
        SeriesCalculator scal = new SeriesCalculator();
        int sum = scal.calculateSum(5);
        System.out.println("Sum of the series: "+sum);
    }
}
