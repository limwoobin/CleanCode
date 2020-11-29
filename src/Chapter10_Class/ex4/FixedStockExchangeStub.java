package Chapter10_Class.ex4;

import Chapter03_Function.ex1.Money;

public class FixedStockExchangeStub implements StockExchange {

    @Override
    public Money currentPrice() {
        return null;
    }

    public void fix(String exchange , int money) {

    }
}
