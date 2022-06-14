package StockMarket;

public class MyAccount {
    String firstName;
    String lastName;
    String mobileNumber;
    double balance;

    public boolean debit(double totalSharePrice, double balance) {
        if (balance >= totalSharePrice) {
            return true;
        }else {
            return false;
        }
    }
}
