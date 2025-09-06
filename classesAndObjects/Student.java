package classesAndObjects;

public class Student {

    private String name;
    private int rollno;
    private double marks;

    //contructor to initialize name, rollno, marks
    public Student(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    //method to calculate grade
    public  String calculateGrade(){
        if(marks >= 90){
            return "A";
        } else if (marks >= 70) {
            return "B";
        }else if(marks >= 60){
            return "C";
        } else if (marks >= 50) {
            return "D";
        }else{
            return "F";
        }
    };

    public void displayGrade(){
        System.out.println("Student name: "+ name);
        System.out.println("rollno: "+ rollno);
        System.out.println("Marks: "+ marks);
        System.out.println("Grade: "+ calculateGrade());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sai",101,80);
        Student s2 = new Student("vamshi",102,70);
        Student s3 = new Student("Ajay",103,91);
        Student s4 = new Student("Ravi",104,69);
        Student s5 = new Student("Nikhil",105,49);


        s1.displayGrade();
        s2.displayGrade();
        s3.displayGrade();
        s4.displayGrade();
        s5.displayGrade();
    }
}
