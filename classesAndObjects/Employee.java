package classesAndObjects;

public class Employee {
    private int id;
    private String name;
    private String dept;

    Employee(int id){
        this.id = id;
    }

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    Employee(int id, String name,String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public void display(){
        System.out.println("ID: "+ id);
        if(name != null){
            System.out.println("Name: "+name);
        }
        if(dept != null){
            System.out.println("Dept: "+dept);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101);
        Employee emp2 = new Employee(102, "Sailesh");
        Employee emp3 = new Employee(103,"Vamshi", "Developer");

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
