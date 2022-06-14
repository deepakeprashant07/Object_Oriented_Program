package StockMarket;

import java.util.Scanner;

public class StockMainClass {
    public static StockPortfolio stockPortfolio = new StockPortfolio();
    public static MyAccount myAccount = new MyAccount();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StockMainClass stockMainClass = new StockMainClass();
        stockMainClass.stocks();
        stockMainClass.account();
        stockPortfolio.dashBoard();
        System.out.println("Which Share buy! Share Name");
        String shareName = scan.nextLine();
        System.out.println("How Many Share Buy");
        int totalShare = scan.nextInt();
        stockPortfolio.calculateValueOf(shareName,totalShare);
    }
    public void stocks() {
        Stock tataShare = new Stock();
        tataShare.stockName = "Tata Motor";
        tataShare.stockPrice = 150.5;
        tataShare.availableStock = 200;

        Stock bajajShare = new Stock();
        bajajShare.stockName = "Bajaj Finance";
        bajajShare.stockPrice = 562.63;
        bajajShare.availableStock = 150;

        Stock sbiShare = new Stock();
        sbiShare.stockName = "SBI Bank's";
        sbiShare.stockPrice = 461.85;
        sbiShare.availableStock = 1430;
        stockPortfolio.addStock(tataShare,bajajShare,sbiShare);
    }
    public void account(){
        System.out.println("Enter Your First Name");
        myAccount.firstName = scan.next();
        System.out.println("Enter Your Last Name");
        myAccount.lastName = scan.next();
        System.out.println("Enter 10-digit Mobile Number");
        myAccount.mobileNumber = scan.next();
        System.out.println("Add Amount in your account");
        System.out.println("Enter Amount");
        myAccount.balance = scan.nextDouble();

        stockPortfolio.add(myAccount.firstName, myAccount.lastName,myAccount.mobileNumber,myAccount.balance);
    }
}
