package ru.cbrrateclient.clients;

import ru.cbrrateclient.model.CurrencyRate;

import java.time.LocalDate;

public interface RateClient {

    CurrencyRate getCurrencyRate(String currency, LocalDate date);
}
