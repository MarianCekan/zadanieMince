package tests;

import com.company.Objects.Wallet;
import com.company.Processing;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testFullScenario {

    String filePath = "src/com/company/example.csv";
    Processing processing = new Processing();
    ArrayList<Wallet> wallets = processing.returnWallets(filePath);
    Wallet wallet = processing.getWalletByOwnerName(wallets, "Adam");

    @org.junit.Test
    public void testFullCoinsSize() {
        int expectedQuantity = wallet.getAllCoins().size();
        assertEquals(2,expectedQuantity);
    }

    @org.junit.Test
    public void testFullBanknotesSize() {
        int expectedQuantity = wallet.getAllBanknotes().size();
        assertEquals(7,expectedQuantity);
    }

    @org.junit.Test
    public void testFullLargestBanknote() {
        int expectedQuantity = wallet.getLargestBanknoteValue();
        assertEquals(500,expectedQuantity);
    }

    @org.junit.Test
    public void testFullSmallestBanknote() {
        int expectedQuantity = wallet.getSmallestBanknoteValue();
        assertEquals(5,expectedQuantity);
    }


}
