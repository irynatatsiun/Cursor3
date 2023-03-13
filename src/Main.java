import library.BankClient;
import library.account.Account;
import library.account.CreditAccount;
import library.account.DebitAccount;
import library.bank.Bank;
import library.user.User;

public class Main {
    public static void main(String[] args) {
        double amountOfAccounts = 0;
        Bank mono = new Bank("mono","03040", 73849.5);
        Bank pBank = new Bank("pBank", "82801", 27838.2);

        BankClient alisa = new BankClient(929, "alisa", 26, "alisa@yahoo.com","0930303033",
                "37784", "Lemberg city" );
        User user = new User();
        CreditAccount creditAccount = new CreditAccount(" 278", 5758.2, user, mono,
                734.8);
        DebitAccount debitAccount = new DebitAccount(" 473", 875.39, user, mono);
        mono.addAccount(creditAccount);
        mono.addAccount(debitAccount);

        System.out.println(mono.getMoneyAmount());
        System.out.println(creditAccount.withdraw(50.0));
        System.out.println(debitAccount.withdraw(6.1));
    }
}
