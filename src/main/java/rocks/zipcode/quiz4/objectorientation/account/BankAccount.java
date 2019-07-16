package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double balance;
    private Long id;

    public void setBalance(Double balance) {
        this.balance=balance;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
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
