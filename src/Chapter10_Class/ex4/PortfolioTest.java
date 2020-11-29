package Chapter10_Class.ex4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PortfolioTest {
    private FixedStockExchangeStub exchange;
    private Portfolio portfolio;

    @Before
    protected void setUp() throws Exception {
        exchange = new FixedStockExchangeStub();
        exchange.fix("MSFT" , 100);
        portfolio = new Portfolio(exchange);
    }

    @Test
    public void GivenFiveMSFTTotalShouldBe500() throws Exception {
        portfolio.add(5 , "MSFT");
        Assert.assertEquals(500 , portfolio.value());
    }
}
