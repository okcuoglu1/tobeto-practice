package com.tobeto.java3a.homework2.cleancode;

public class CentralBankService implements IBankService {
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.0; //usd 30

        }

    }



