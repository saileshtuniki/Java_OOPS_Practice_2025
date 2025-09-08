package classesAndObjects;

public class ArrayEmployee {

    private int empNo;
    private String name;
    private String department;
    private double salary;

    public ArrayEmployee(int empNo,String name,String department, double salary){
        this.empNo = empNo;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }




    public void displayData(){

        System.out.println("Employee Number: "+ empNo);
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee department: " + department);
        System.out.println("Employee Salary: "+ salary);
        System.out.println("____________________________________");
    }



    public static void main(String[] args) {

        if(args.length < 20){
            System.out.println("please provide data for 5 employees");
            return;
        }

        //arr to store employee objects.
        ArrayEmployee[] employee = new ArrayEmployee[5];

        for(int i=0; i < 5 ; i++) {
            int empNo = Integer.parseInt(args[i *  4 ]);
            String name = args[i * 4 + 1];
            String dept = args[i * 4 + 2];
            double salary = Double.parseDouble(args[i* 4 + 3]);

            employee[i] = new ArrayEmployee(empNo, name, dept, salary);
        }

        System.out.println("Employee details:");
        System.out.println("_________________");

        for(ArrayEmployee emp: employee){
            emp.displayData();
        }

        //find high salary

        ArrayEmployee highSalary = employee[0];
        for(ArrayEmployee emp : employee){
            if(emp.salary > highSalary.salary){
                highSalary = emp;
            }
        }
        System.out.println("Employee with high Salary:");
        System.out.println("--------------------------");

        highSalary.displayData();


    }
}
