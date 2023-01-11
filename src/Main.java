import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name password and balance to create an accounts");

        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBI_User user = new SBI_User(name,balance,password);

        // add money
        String message = user.addMoney(10000);
        System.out.println(message);

        //withdraw
        System.out.println("Enter Amount");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        // rate of interest
        System.out.println(user.calculateInterest(10));
    }
}