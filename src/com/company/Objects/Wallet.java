package com.company.Objects;

import com.company.Interfaces.WalletInterface;
import com.company.Objects.Banknote;
import com.company.Objects.Coin;

import java.util.ArrayList;


public class Wallet implements WalletInterface {
    private ArrayList<Banknote> walletBanknotes;
    private ArrayList<Coin> walletCoins;
    private String walletOwnerName = "";

    public Wallet(String ownerName, ArrayList<Banknote> banknotes, ArrayList<Coin> coins) {
        this.walletOwnerName = ownerName;
        this.walletBanknotes = banknotes;
        this.walletCoins = coins;
    }

    public void printInfo() {
        System.out.println("Peňaženka používateľa: " + getWalletOwnerName());
        System.out.println("Najväčšia bankovka: " + getLargestBanknoteValue());
        System.out.println("Najmenšia bankovka: " + getSmallestBanknoteValue());
        System.out.println("Najmenšia minca: " + getSmallestCoinValue());
        System.out.println("Najväčšia minca: " + getLargestCoinValue());
    }


    @Override
    public ArrayList<Banknote> getAllBanknotes() {
        return walletBanknotes;
    }

    @Override
    public int getSmallestBanknoteValue() {
        int smallestValue = Integer.MAX_VALUE;
        if (!walletBanknotes.isEmpty()) {
            for (Banknote banknote : walletBanknotes) {
                int value = banknote.getValue();
                if (value < smallestValue) {
                    smallestValue = value;
                }
            }

            return smallestValue;
        } else {
            return 0;
        }
    }

    @Override
    public int getLargestBanknoteValue() {
        int largestValue = 0;
        for (Banknote banknote : walletBanknotes) {
            int value = banknote.getValue();
            if (value > largestValue) {
                largestValue = value;
            }
        }
        return largestValue;
    }

    @Override
    public ArrayList<Coin> getAllCoins() {
        return walletCoins;
    }

    @Override
    public int getLargestCoinValue() {
        int largestValue = 0;
        for (Coin coin : walletCoins) {
            int value = coin.getValue();
            if (value > largestValue) {
                largestValue = value;
            }
        }
        return largestValue;
    }

    @Override
    public int getSmallestCoinValue() {
        int smallestValue = Integer.MAX_VALUE;
        if (!walletCoins.isEmpty()) {
            for (Coin coin : walletCoins) {
                int value = coin.getValue();
                if (value < smallestValue) {
                    smallestValue = value;
                }
            }
            return smallestValue;
        } else {
            return 0;
        }
    }

    @Override
    public void addBanknote(Banknote banknote) {
        this.walletBanknotes.add(banknote);
    }

    @Override
    public void addCoin(Coin coin) {
        this.walletCoins.add(coin);
    }

    public String getWalletOwnerName() {
        return walletOwnerName;
    }

    public void setWalletOwnerName(String walletOwnerName) {
        this.walletOwnerName = walletOwnerName;
    }
}