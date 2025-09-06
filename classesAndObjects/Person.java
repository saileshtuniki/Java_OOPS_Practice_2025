package classesAndObjects;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Overriding the toString method
    @Override
    public String toString(){
        return firstName +" "+ lastName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sailesh", "tuniki");

        System.out.println("Full Name: " + p1.toString());
    }
}
