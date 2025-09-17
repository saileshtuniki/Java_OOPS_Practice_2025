package classesAndObjects.overriding;

import java.util.Scanner;

class Customer {

    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public double calculatePrice(double price){

        System.out.println("Total Bill: "+ price);
        return price;
    }

    public void regularCustomerDetails(){

        System.out.println("Name: "+ name);
        System.out.println("address: "+ address);
        System.out.println("phone: "+ phone);
    }

}
class VipCustomer extends Customer{

    private double discountRate;

    public VipCustomer(String name, String address, String phone, double discountRate){
        super(name, address, phone);
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(double price){
        double discount = price * (discountRate/100);
        double finalPrice = price - discount;

        System.out.println("Discounted price: "+ discount);
        System.out.println("Final price after discount: "+ finalPrice);

        return finalPrice;
//        return price - discount;
    }

    public String displayVipCustomerDetails(){
        regularCustomerDetails();
        return "Vip discount rate: " + discountRate+"%" ;
    }



}
public class CustomerTest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer rc = new Customer("Vamshi","124-street-1", "123-456-7891");
        double regularPrice = 1000.0;
        System.out.println("Regular Customer:");
        rc.regularCustomerDetails();
        rc.calculatePrice(regularPrice);

        System.out.println("\t");

        VipCustomer vc = new VipCustomer("Sailesh", "198-mainRoad-2", "234-456-9872", 15.0);
        System.out.println("Vip customer Details: ");

        System.out.println("Enter Total amount: ");
        double vipPrice = sc.nextDouble();
        System.out.println(vc.displayVipCustomerDetails());
        vc.calculatePrice(vipPrice);


    }
}





