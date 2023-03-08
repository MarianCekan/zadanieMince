package com.company.Objects;

import com.company.Interfaces.BanknoteInterface;

public class Banknote implements BanknoteInterface {

    private int value;

    public Banknote(int value) {
        this.value = value;
    }


    @Override
    public int getValue() {
        return this.value;
    }
}
