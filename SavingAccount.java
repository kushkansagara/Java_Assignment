class SavingAccount extends Account{

    public SavingAccount() {
        super();
    }


    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    public void Withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else{
            System.out.println("Error! Savings account overdrawn transtaction rejected");
        }

    }
}
