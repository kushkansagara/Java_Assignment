import java.util.*;
class AC
{
    static int ID=1;//will have total number of Accounts
    int id;

    AC(int id)
    {
        this.id = id;

    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double balance=100;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void printID() {
        System.out.printf("Your Account ID is :-  "+"AC"+"%03d\n",ID);

        ID++;
    }

    public void balanceInquiry()
    {
        System.out.println("Balance of account id "+id+" is:- "+balance);
    }
    public void withdrawMoney(double money)
    {
        if(money>balance)
        {
            System.out.println("Not sufficient Balance");
        }
        else if(balance<=300)
        {

            System.out.println("Soryy..You can not Withdraw money.. \n Maintain Proper Balance");
        }
        else
        {
            System.out.println("You have withdrawn "+money+" Rupees");
            balance = balance - money;
            System.out.println("Now you have "+balance+"  balance left");
        }
    }
    public void deposit()
    {
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit:-");
        money = sc.nextDouble();
        balance = balance + money;
        System.out.println("Your balance is:-"+balance);

    }
    public void moneyTransfer(ArrayList<AC> l)
    {
        double money;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("To  which account number do you want to transfer money?");
        id = sc.nextInt();
        System.out.println("Enter the amount of money you want to transfer to id "+id);
        money = sc.nextDouble();
        AC a = l.get(--id);
        if(money>=this.balance)
        {
            System.out.println("Can't Transfer Money \n Insufficient Balance...");
        }
        else if(this.balance<=300)
        {
            System.out.println("Soryy..You can not transfer money.. \n Maintain Proper Balance");
        }
        else
        {
            a.balance = a.balance + money;
            this.balance = this.balance - money;
            System.out.println(money+" Money has been Transfered from ID "+this.id+" to ID "+a.id);
            System.out.println("Remaining balance in ID "+this.id+" is "+this.balance+" Doller");
            System.out.println("\n Balance in ID "+a.id+" is "+a.balance);
        }

    }
    public void createAccount(ArrayList<AC> a)
    {

        a.add(new AC(ID));
        AC.printID();
    }
    public void Deactivate(ArrayList<AC> a,int ID)
    {
        a.remove(--ID);
        AC.ID--;
    }

    public static class CheckAccount {
    }
}

