public class BankAccount {
    IPerson accountHolder;
    double balance;

    public BankAccount(IPerson accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public IPerson getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateClientAdvantage() throws InvalidAccountTypeException {
        int clientAdvantage = (accountHolder.calculateCreditScore() * 10) / 100;
        return clientAdvantage;
    }
}
