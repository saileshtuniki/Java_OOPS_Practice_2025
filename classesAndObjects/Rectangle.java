package classesAndObjects;

public class Rectangle {
    private double length;
    private double width ;

    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        if(length > 0){
            this.length = length;
        }else{
            System.out.println("The length must be positive");
        }
    }

    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }else{
            System.out.println("The width must be positive");
        }
    }



    public  double CalAreaOfRectangle(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle area1 = new Rectangle();
        area1.setLength(10);
        area1.setWidth(5);

        System.out.println("length: "+ area1.getLength());
        System.out.println("width: "+ area1.getWidth());

        System.out.println("Sum: "+area1.CalAreaOfRectangle());

    }
}
