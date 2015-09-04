package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

public class TaxCalculatorTest {

    @Test
    public void shouldCalculateTaxForImportedItems() {
        TaxCalculator taxCalculator = new TaxCalculator(5, 10.0);

        Assert.assertEquals(0.5, taxCalculator.calculateTax(), 0.2d);
    }

    @Test
    public void shouldCalculateTaxForNonImportedItems() {
        TaxCalculator taxCalculator = new TaxCalculator(10, 10.0);

        Assert.assertEquals(1.0, taxCalculator.calculateTax(), 0.2d);
    }
}
