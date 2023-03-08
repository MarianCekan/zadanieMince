package com.company;

import com.company.Objects.Wallet;

import java.util.ArrayList;

public class Main {
//    $ javac com/company/Main.java
//    $ java -cp . com.company.Main "Adam"

    public static void main(String[] args) {

        String filePath = "src/com/company/example.csv";
        Processing processing = new Processing();
        // CHANGE THIS VARIABLE TO TEST
        String name = "Brano";

        try {
            ArrayList<Wallet> wallets = processing.returnWallets(filePath);
            Wallet wallet = processing.getWalletByOwnerName(wallets, name);
//            Wallet wallet = processing.getWalletByOwnerName(wallets, args[0]);
            wallet.printInfo();
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
    }

}
