package library.account;

import library.bank.Bank;
import library.user.User;

public class CreditAccount extends Account {
    private Double accountLimit;

    public CreditAccount(String accountNumber, Double accountBalance, User user, Bank bank, Double accountLimit) {

        super(accountNumber, accountBalance, user, bank);
        this.accountLimit = accountLimit;
    }

    @Override
    public String withdraw(Double amount) {
        double calculateAmount = amount - (amount * 0.1);
        return "commission of credit account withdraw is 10 percent" + calculateAmount;
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "accountLimit=" + accountLimit +
                '}';
    }
}
