package com.company;


import com.company.Objects.Banknote;
import com.company.Objects.Coin;
import com.company.Objects.Wallet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Processing {
    // character that identify coin in csv file
    String coinIdentifier = "m";
    // splitter in csv file like , or ;
    String splitter = ";";
    // reader object
    BufferedReader reader = null;
    // line of csv file
    String line = "";


    // returns Wallet object from given CSV line
    public ArrayList<Wallet> returnWallets(String fileName) {

        ArrayList<Wallet> wallets = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                wallets.add(returnWallet(line));
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Incorrect input");
            System.exit(0);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Incorrect input");
            System.exit(0);
        }
        return wallets;
    }

    // returns Wallet object based on owner name
    public Wallet getWalletByOwnerName(ArrayList<Wallet> wallets, String ownerName) {
        for (Wallet wallet : wallets) {
            if (wallet.getWalletOwnerName().equals(ownerName)) {
                return wallet;
            }
        }
        return null; // Wallet with specified owner name not found
    }

    // returns Wallet object by specified string in csv format
    Wallet returnWallet(String csvLine) {
        return new Wallet(getWalletOwnerName(csvLine), extractBanknotes(csvLine), extractCoins(csvLine));
    }

    // returns owner of specified string in csv format
    String getWalletOwnerName(String csvLine) {
        return splitCsvLine(csvLine).get(0);
    }

    // returns all Banknotes in wallet
    ArrayList<Banknote> extractBanknotes(String csvLine) {

        ArrayList<Banknote> banknotes = new ArrayList<>();

        for (String element : splitCsvLine(csvLine)) {
            // since the only requirement for banknote is to be integer
            if (isNumber(element)) {
                banknotes.add(new Banknote(Integer.parseInt(element)));
            }
        }
        return banknotes;
    }

    // returns true/false value based on if input is number
    private boolean isNumber(String element) {
        try {
            Integer.parseInt(element);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // returns all Coins in wallet
    ArrayList<Coin> extractCoins(String csvLine) {
        ArrayList<Coin> coins = new ArrayList<>();
        for (String element : splitCsvLine(csvLine)) {
            if (isValidCoin(element)) {
                coins.add(new Coin(Integer.parseInt(element.replace(coinIdentifier, ""))));
            }
        }
        return coins;
    }

    // returns true/false based on if input is valid coin
    private boolean isValidCoin(String element) {
        if (element.indexOf(coinIdentifier) != -1 && isNumber(element.replace(coinIdentifier, ""))) {
            return true;
        }
        return false;
    }

    // splitting csv into array of string elements
    ArrayList<String> splitCsvLine(String csvLine) {
        ArrayList<String> result = new ArrayList<>();

        for (String element : csvLine.split(splitter)) {
            result.add(element);
        }
        return result;
    }
}
