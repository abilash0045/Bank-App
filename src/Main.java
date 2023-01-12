import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name password and balance to create an accounts");

        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        HDFC_User user = new HDFC_User(name,password,balance);

        // add money
        String message = user.addMoney((int)balance);
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