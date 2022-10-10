import java.util.Scanner;
public class TestAccount_Main {
    public static void main(String[] args) {


        Account a =new Account(1,50000);
        SavingAccount s = new SavingAccount(1,50000);
        CheckAccount c = new CheckAccount(1,50000,10000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to Withdraw:-");
        double amount = sc.nextDouble();

        c.withdraw(amount);
        System.out.println(c.toString());
        a.withdraw(amount);
        System.out.println(a.toString());
        s.Withdraw(amount);
        System.out.println(s.toString());

    }

}

