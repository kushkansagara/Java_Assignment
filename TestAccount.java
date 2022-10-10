import java.util.*;
public class TestAccount {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Date D = new Date();


        //call the Static function directly by the class name.
        double b;
        System.out.println("Enter Your Balance:-");
        b = sc.nextDouble();
        Account a = new Account(Account.getID(),b);
        a.setDate(D);
        System.out.println("Date is :- "+ a.getDate());
        double amount;
        System.out.println("enter the amount to be withdrawn:-");
        amount = sc.nextDouble();
        a.withdraw(amount);
        b = a.getMonthlyInterestRate();
        System.out.println("Your monthly interest rate is:-"+b);
        b = a.getMonthlyInterest();
        System.out.println("Your monthly interest is:-"+b);
        sc.close();
    }
}


