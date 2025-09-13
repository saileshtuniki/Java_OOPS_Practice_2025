package classesAndObjects.abstractExample;

 class Circle extends Shape{

    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

     @Override
     public double calculateArea(){
         return  Math.PI * radius*radius;
     }

     @Override
     public double calculatePerimeter(){
         return 2 * Math.PI * radius;
     }

     public double getRadius(){
        return radius;
     }

    public static void main(String[] args) {

        //create an instance of circle
        Circle c1 = new Circle(5);

        System.out.println("Circle: ");
        System.out.println("Radius: "+ c1.getRadius());
        System.out.println("Area: "+ c1.calculateArea());
        System.out.println("Perimeter: "+ c1.calculatePerimeter());
    }
}



