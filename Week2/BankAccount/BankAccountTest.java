package Week2.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount nicksBankAcc = new BankAccount();
        nicksBankAcc.depositingMoney(200.00, "checking");
        nicksBankAcc.depositingMoney(100.00, "savings");
        System.out.println("New Bank Account--"+nicksBankAcc.getAccountNumb());
        nicksBankAcc.displayAccountBalance();
        System.out.println(BankAccount.totalHold);

        nicksBankAcc.withdrawMoney(50.00, "checking");
        nicksBankAcc.withdrawMoney(100.00, "savings");
        nicksBankAcc.displayAccountBalance();
        System.out.println(BankAccount.totalHold);
    }
}
