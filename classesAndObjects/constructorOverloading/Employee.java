package classesAndObjects.constructorOverloading;

public class Employee {

    private int empNo;
    private String empName;
    private String empRole;
    private double salary;

    public Employee(int empNo, String empName, String empRole, double salary ) {
        this.empNo = empNo;
        this.empName = empName;
        this.empRole = empRole;
        this.salary = salary;
    }

//    public Employee(String empRole, double salary){
//        this.empRole = empRole;
//        this.salary = salary;
//    }

    //default constructor
    public Employee(){
        this.empNo = 0;
        this.empName = "unknown";
        this.empRole = "intern";
        this.salary = 0.0;
    }

    public void display(int empNo){
        System.out.println("Employee Id: "+ empNo);
    }

    public void display(String empName, String empRole){
        System.out.println("Employee Name: "+ empName+ "\nEmployee Role: "+ empRole);
    }

    public void display(double salary){
        System.out.println("Employee Salary: "+ salary);
    }

    public void display() {
        System.out.println("Employee ID: " + empNo);
        System.out.println("Name: " + empName);
        System.out.println("Role: " + empRole);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.display(101);

        emp1.display("Sailesh", "Developer");

        emp1.display(55000.0);

        System.out.println("------------------------------------");
        //to display all emp details
        emp1.display();
    }
}
