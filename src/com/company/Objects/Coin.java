package com.company.Objects;

import com.company.Interfaces.CoinInterface;

public class Coin implements CoinInterface {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
