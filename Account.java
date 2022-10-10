import java.util.*;
class Account
{
    private static int ID=0;
    private double balance;
    private double annualInterestRate=7;
    private Date date;
    public static int getID() {

        return ID;

    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Account()
    {
        ID = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int id,double b)
    {
        ID = id;
        balance = b;
    }

    public double getMonthlyInterestRate()
    {
        return ((float)annualInterestRate/12);
    }

    public double getMonthlyInterest()
    {
        return ((float)annualInterestRate/100)/12;
    }

    public void withdraw(double a)
    {
        balance-=a;
        System.out.println("Your current balance is:-"+balance);
    }

    public String toString()
    {
        Date d = new Date();
        System.out.println(d);
        setDate(d);
        return ("Account id is :- " + getID() + "\nYour Balance is:- " + getBalance() + "\nAccount created on date:- " + d + "\nMonthly Interest is:-  "+getMonthlyInterest());
    }
}



