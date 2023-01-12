import java.util.Objects;
import java.util.UUID;

public class HDFC_User implements Bank_Interface{

    String name;
    String password;
    String accountno;
    double balance;
    double rateofinterest;
    public HDFC_User(String name,String password,double balance){
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateofinterest = 12;
        this.accountno = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(double rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance += amount;
        return "Money add successfully Your new Balance is: " + this.balance;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        if (Objects.equals(this.password,password)){
            if (this.balance < amount){
                return "Look at you brookieee";
            }else{
                balance -= amount;
            }
        }

        return "I'm already rich rich";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance*years*rateofinterest)/100;
    }
}
