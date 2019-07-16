package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
   private Double HoursWorked=0.0;
   private Double HourlyWage=35.0;
   private Double MoneyEarned;
   BankAccount bankAccount;
   private Double balance;

    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount=bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount=bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        HoursWorked+=numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return HoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return HourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return MoneyEarned;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance+=amountToIncreaseBy;


    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance-=amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }



}
