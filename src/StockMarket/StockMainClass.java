package StockMarket;

import java.util.Scanner;

public class StockMainClass {
    public static StockPortfolio stockPortfolio = new StockPortfolio();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StockMainClass stockMainClass = new StockMainClass();
        stockMainClass.stocks();
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
}
