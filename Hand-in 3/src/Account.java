import java.util.*;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }
    void setId(int id){
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterest(){
        double rate = getAnnualInterestRate();
        double interest = this.balance * rate;
        return interest;
    }

    double getMonthlyInterestRate(){
        int months = 12;
        double rate = annualInterestRate / months;
        return rate;
    }

    double withdraw(double wAmount){
        this.balance = this.balance - wAmount;
        return this.balance;
    }

    double deposits(double depAmount){
        balance = balance + depAmount;
        return balance;
    }
}

