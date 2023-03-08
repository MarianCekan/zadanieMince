package tests;

import com.company.Objects.Coin;
import com.company.Objects.Wallet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testCoins {

    @org.junit.Test
    public void testAddingBanknotes() {
        ArrayList<Coin> coins = new ArrayList<>();
        Wallet wallet = new Wallet("Adam", null, coins);
        wallet.addCoin(new Coin(30));
        int expectedQuantity = wallet.getAllCoins().size();
        assertEquals(1,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingLargestCoin() {
        ArrayList<Coin> coins = new ArrayList<>();
        Wallet wallet = new Wallet("Adam", null, coins);
        wallet.addCoin(new Coin(30));
        wallet.addCoin(new Coin(1));
        int expectedQuantity = wallet.getLargestCoinValue();
        assertEquals(30,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingSmallestCoin() {
        ArrayList<Coin> coins = new ArrayList<>();
        Wallet wallet = new Wallet("Adam", null, coins);
        wallet.addCoin(new Coin(30));
        wallet.addCoin(new Coin(1));
        int expectedQuantity = wallet.getSmallestCoinValue();
        assertEquals(1,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingSmallestCoinEmpty() {
        ArrayList<Coin> coins = new ArrayList<>();
        Wallet wallet = new Wallet("Adam", null, coins);
        int expectedQuantity = wallet.getSmallestCoinValue();
        assertEquals(0,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingLargestCoinEmpty() {
        ArrayList<Coin> coins = new ArrayList<>();
        Wallet wallet = new Wallet("Adam", null, coins);
        int expectedQuantity = wallet.getLargestCoinValue();
        assertEquals(0,expectedQuantity);
    }


}

