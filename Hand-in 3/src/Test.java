public class Test {
    public static void main(String[] args){
        Account acc1 = new Account(1122, 20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposits(3000);
        System.out.println("Balance is " + acc1.getBalance());
        System.out.println("Monthly interest is " + acc1.getMonthlyInterest());
        System.out.println(acc1.getDateCreated());
    }
}
