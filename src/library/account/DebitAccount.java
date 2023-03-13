package library.account;

import library.bank.Bank;
import library.user.User;

public class DebitAccount extends Account {
    public DebitAccount(String accountNumber, Double accountBalance, User user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
    }

    @Override
    public String withdraw(Double amount) {
        return "You will get money without any commission:" + amount;
    }
}
