package com.company.Interfaces;

import com.company.Objects.Banknote;
import com.company.Objects.Coin;

import java.util.ArrayList;

public interface WalletInterface {
//    Wallet getWalletByOwnerName(ArrayList<Wallet> wallets, String ownerName);

    ArrayList<Banknote> getAllBanknotes();

    int getSmallestBanknoteValue();

    int getLargestBanknoteValue();

    ArrayList<Coin> getAllCoins();

    int getSmallestCoinValue();

    int getLargestCoinValue();

    void addBanknote(Banknote banknote);

    void addCoin(Coin coin);

}



