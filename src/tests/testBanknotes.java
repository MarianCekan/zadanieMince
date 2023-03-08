package tests;

import com.company.Objects.Banknote;
import com.company.Objects.Wallet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testBanknotes {

    @org.junit.Test
    public void testAddingBanknotes() {
        ArrayList<Banknote> banknotes = new ArrayList<>();
        Wallet wallet = new Wallet("Adam",banknotes,null);
        wallet.addBanknote(new Banknote(30));
        int expectedQuantity = wallet.getAllBanknotes().size();
        assertEquals(expectedQuantity, 1);
    }

    @org.junit.Test
    public void testGettingLargestBanknote() {
        ArrayList<Banknote> banknotes = new ArrayList<>();
        Wallet wallet = new Wallet("Adam",banknotes,null);
        wallet.addBanknote(new Banknote(30));
        wallet.addBanknote(new Banknote(1));
        int expectedQuantity = wallet.getLargestBanknoteValue();
        assertEquals(expectedQuantity, 30);
    }

    @org.junit.Test
    public void testGettingSmallestBanknote() {
        ArrayList<Banknote> banknotes = new ArrayList<>();
        Wallet wallet = new Wallet("Adam",banknotes,null);
        wallet.addBanknote(new Banknote(30));
        wallet.addBanknote(new Banknote(1));
        int expectedQuantity = wallet.getSmallestBanknoteValue();
        assertEquals(1,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingSmallestBanknoteEmpty() {
        ArrayList<Banknote> banknotes = new ArrayList<>();
        Wallet wallet = new Wallet("Adam",banknotes,null);
        int expectedQuantity = wallet.getSmallestBanknoteValue();
        assertEquals(0,expectedQuantity);
    }

    @org.junit.Test
    public void testGettingLargestBanknoteEmpty() {
        ArrayList<Banknote> banknotes = new ArrayList<>();
        Wallet wallet = new Wallet("Adam",banknotes,null);
        int expectedQuantity = wallet.getLargestBanknoteValue();
        assertEquals(0,expectedQuantity);
    }


}

