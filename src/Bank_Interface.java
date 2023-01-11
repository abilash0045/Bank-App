public interface Bank_Interface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int anount,String password);
    double calculateInterest(int years);
}
