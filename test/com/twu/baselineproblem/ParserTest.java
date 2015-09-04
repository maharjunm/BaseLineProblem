package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    @Test
    public void shouldReturnTheTaxPercentageForImportedItems() {
        Parser parser = new Parser("1 imported box of chocolates at 10.00");

        Assert.assertEquals(0.5,parser.calculateTax(),0.2d);
    }
}
