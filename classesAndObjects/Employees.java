package classesAndObjects;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


//initialize the data members using command line arguments.
public class Employees {

    private int empNo;
    private String name;
    private String department;
    private double salary;

    public Employees(int empNo,String name,String department, double salary){
        this.empNo = empNo;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmp(){
        System.out.println("Employee details:");

        System.out.println("Employee Number: "+ empNo);
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee department: " + department);
        System.out.println("Employee Salary: "+ salary);
    }

    public static void main(String[] args) {

        if(args.length != 4){
            System.out.println("please provide all req cmd line arguments:");
            return;
        }

        // without using Scanner class passing args from command line arguments.
        int empNo = Integer.parseInt(args[0]);
        String name = args[1];
        String department = args[2];
        double salary = Double.parseDouble(args[3]);


        Employees emp1 = new Employees(empNo,name,department, salary);

        emp1.displayEmp();

    }
}
