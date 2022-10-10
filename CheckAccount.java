import java.util.Scanner;
class CheckAccount extends Account{

    private double OverdraftLimit;
    public double getOverdraftLimit() {
        return this.OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
    CheckAccount()
    {
        super();
        OverdraftLimit = -10;
    }
    CheckAccount(int id,double balance,double over)
    {
        super(id,balance);
        OverdraftLimit = over;
    }
    public void withdraw(double amount)
    {
        if(getBalance() - amount < OverdraftLimit)
        {
            System.out.println("Overdraft Limit warning..!! \n You Cannot withdraw Money");
        }
        else
        {
            amount = getBalance() - amount;
            setBalance(amount);
        }
    }
    public String toString()
    {
        return (super.toString() + "\nOverDraft Limit:- " + getOverdraftLimit());
    }
}

