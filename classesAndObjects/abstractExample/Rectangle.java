package classesAndObjects.abstractExample;


public  class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return  length * width;
    }

    @Override
     public double calculatePerimeter(){
        return 2*(length + width);
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public static void main(String[] args) {

        Rectangle r1 =  new Rectangle(4,9);
        System.out.println("Rectangle: ");
        System.out.println("Length: "+ r1.getLength());
        System.out.println("Width: "+ r1.getWidth());
        System.out.println("Area: "+ r1.calculateArea());
        System.out.println("Perimeter: "+ r1.calculatePerimeter());


    }

}
