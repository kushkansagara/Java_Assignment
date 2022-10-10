import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class New
{
    public static void main(String[] args)
    {
        ArrayList<AC> l = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            l.add(new  AC(AC.ID));

            AC.ID++;
        }
        int n;
        final boolean i=true;
        Scanner sc = new Scanner(System.in);
        while(i)
        {
            System.out.println("Enter your ID in Digits:-");
            n = sc.nextInt();
            if(n>(AC.ID-1) || n==0)
            {
                System.out.println("Incorrect ID please Try again...");
                continue;
            }
            else
            {
                AC b = l.get(--n);

                System.out.println("Press 1 for Balance Inquiry \n Press 2 to Withdraw Money \n Press 3 to Deposit money \n Press 99 to Exit \n Enter Your Choice :-");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        b.balanceInquiry();
                        break;

                    case 2:
                        System.out.println("Enter the amount you want to Withdraw:-");
                        double money = sc.nextDouble();
                        b.withdrawMoney(money);
                        break;

                    case 3:
                        b.deposit();
                        break;

                    case 99:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Input..!! \n Try again...");
                }
            }
        }

    }
}

