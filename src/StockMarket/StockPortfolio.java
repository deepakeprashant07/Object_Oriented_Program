package StockMarket;

import java.util.HashSet;
import java.util.Set;

public class StockPortfolio {
    Set<Stock> shares = new HashSet<>();
    public void dashBoard() {
        System.out.println("Sr.No |\t Shares  \t\t\t|\tEach Stock Price \t| Available");
        System.out.println("|---------------------------------------------------------------|");
        int i = 1;
        for (Stock share: shares) {
            System.out.println(i+"] "+share.stockName+"\t\t\t\t "+share.stockPrice+
                                    " Rs\t\t\t"+share.availableStock);
            i++;
        }
        System.out.println("|---------------------------------------------------------------|");
    }
    public void addStock(Stock tataShare,Stock bajajShare,Stock sbiShare) {
        shares.add(tataShare);
        shares.add(bajajShare);
        shares.add(sbiShare);
    }

    public void calculateValueOf(String shareName, int totalShare) {
        for (Stock share: shares) {
            if (shareName.equals(share.stockName))
            {
                double totalSharePrice = share.stockPrice * totalShare;
                System.out.println("Share Name :- "+shareName+"\nNumber of Share :- "+totalShare+
                        "\nEach Stock Price :-"+share.stockPrice+"\nTotal Price Buy :-"+totalSharePrice+"Rs");
            }
        }
    }
}
