package classesAndObjects;

import java.util.Scanner;

public class BankAccount {

    private String accountHolderName;
    private int AccNo;
    private double balance;
    private String AccType;

    public BankAccount(String accountHolderName, int AccNo, double balance, String AccType){
        this.accountHolderName = accountHolderName;
        this.AccNo = AccNo;
        this.balance = balance;
        this.AccType = AccType;
    }

    public void depositAmt(double amount){

        if(amount <= 0) {
            System.out.println("amount should be greater than 0");
            return;
        }
        balance += amount;
        System.out.println("New balance after deposit: "+balance);
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Withdrawwn: "+ amount);
        }else{
            System.out.println("Insufficient funds");
        }
    }
    public void displayDetails(){
        System.out.println("---------ACCOUNT DETAILS-----------");
        System.out.println("Account accountHolderName: " + accountHolderName);
        System.out.println("Account Number: " + AccNo);
        System.out.println("Account Type: " + AccType);
        System.out.println("Account balance: " + balance);
    }

    public void currentBalance(){
        System.out.println("Current Balance:"+ balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter account number:");
        int AccNo = sc.nextInt();

        System.out.println("Enter balance:");
        double balance = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter AccountType: (Savings or Current)");
        String AccType = sc.nextLine();
        if(!AccType.equals("Savings")  && !AccType.equals("Current")){
            System.out.println("Invalid Entry");
            return;
        }



//        BankAccount user1 = new BankAccount("a1",123,1000,"Saving");
        BankAccount user1 = new BankAccount(accountHolderName, AccNo, balance, AccType);

        user1.displayDetails();
        user1.depositAmt(1000);
        user1.withdraw(500);
        user1.displayDetails();
        user1.withdraw(100);
        user1.displayDetails();

        user1.currentBalance();
        System.out.println("\nFINAL ACCOUNT DETAILS");
        user1.displayDetails();
    }
}
