package tests;

import com.company.Objects.Wallet;

import static org.junit.Assert.assertEquals;

public class testWalletOwner {

    @org.junit.Test
    public void testGetOwnerName() {
        Wallet wallet = new Wallet("Adam", null, null);
        String expectedString = wallet.getWalletOwnerName();
        assertEquals("Adam", expectedString);
    }

    @org.junit.Test
    public void testSetOwnerName() {
        Wallet wallet = new Wallet("Adam", null, null);
        wallet.setWalletOwnerName("Filip");
        String expectedString = wallet.getWalletOwnerName();
        assertEquals("Filip", expectedString);
    }

    @org.junit.Test
    public void testGetOwnerNameEmpty() {
        Wallet wallet = new Wallet(null, null, null);
        String expectedString = wallet.getWalletOwnerName();
        assertEquals(null, expectedString);
    }

}

