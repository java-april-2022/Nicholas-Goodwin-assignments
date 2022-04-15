package Week2.BankAccount;
import java.util.Random;

class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
//step2

    public static int Numaccs = 0; //step3
    public static double totalHold = 0;//step4


    public BankAccount() {
        BankAccount.Numaccs +=1; //step5
        this.checkingBalance =0;
        this.savingsBalance =0;
        this.accountNumber = BankAccount.generateId();//added for ninja bonus
    }

    public void displayAccountBalance(){
        System.out.println(String.format("Checking account:%.2f, Savings account:%.2f", this.checkingBalance,this.savingsBalance));
    }//display formatting

    public double getCheckingBalance() {
        return this.checkingBalance;
    } //step6

    public double getSavingsBalance() {
        return this.savingsBalance;
    } //step7

    public void depositingMoney(double amount, String account) {
        if(account.equals("savings")) 
            this.savingsBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalHold += amount;
    } //step8

    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingsBalance - amount >=0) {
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >=0) {
                successful=true;
                this.checkingBalance -= amount;
            }
        }
        if (successful) {
            BankAccount.totalHold -=amount;
        }
        else {
            System.out.println("not enough funds available!");}
        }

        public long getAccountNumb() {
            return this.accountNumber;
        }
        private long accountNumber;//Account number ninja bonus

        private static long generateId() {
            Random randGenerator = new Random();
            long randomId = randGenerator.nextLong();
            return randomId;
        } // found code very similar to this on stackoverload cut out alot of the not needed things for my purposes.
        //I think I can insert it while using int as well but I couldnt quite get that to work in a timely manner.
        //Long worked with the number undefined but int seemed to need some default values to not throw an error 
}
