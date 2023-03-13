package library.bank;

import library.account.Account;

public class Bank {
    private String bankName;
    private String bankCode;
    private double moneyAmount = 4000.0;
    static int amountOfAccounts = 0;

    public Bank(String bankName, String bankCode, double moneyAmount) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.moneyAmount = moneyAmount;
    }

    public void addAccount(Account account) {
        amountOfAccounts = amountOfAccounts - 1;
        moneyAmount = moneyAmount - account.getAccountBalance();
        System.out.println("Account was added" + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        amountOfAccounts = amountOfAccounts + 1;
        moneyAmount = moneyAmount + account.getAccountBalance();
        System.out.println("Account was removed" + account.getAccountNumber());
    }

    public String getBankName () {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public static int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
