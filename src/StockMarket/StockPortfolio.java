package StockMarket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StockPortfolio {
    Set<Stock> shares = new HashSet<>();
    ArrayList person = new ArrayList();
    public void dashBoard() {
        System.out.println(person.get(0)+" "+person.get(1));
        System.out.println("Sr.No |\t Shares  \t\t\t|\tEach Stock Price \t| Available");
        System.out.println("|---------------------------------------------------------------|");
        int i = 1;
        for (Stock share: shares) {
            System.out.println(i+"] "+share.stockName+"\t\t\t\t "+share.stockPrice+" Rs\t\t\t"+share.availableStock);
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
                MyAccount myAccount = new MyAccount();
                double balance = (double) person.get(3);
                boolean condition = myAccount.debit(totalSharePrice,balance);
                if(true == condition){
                    System.out.println("Share Name :- "+shareName+"\nNumber of Share :- "+totalShare+
                            "\nEach Stock Price :-"+share.stockPrice+"\nTotal Price Buy :-"+totalSharePrice+"Rs");
                }else {
                    System.out.println("Minimum deposit amount to buy Rs " + totalSharePrice);
                }
            }
        }
    }

    public void add(String firstName,String lastName,String mobileNumber, double balance) {
        person.add(0,firstName);
        person.add(1,lastName);
        person.add(2,mobileNumber);
        person.add(3,balance);
    }
}
