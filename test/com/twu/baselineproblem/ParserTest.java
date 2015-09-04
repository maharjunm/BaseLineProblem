package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    @Test
    public void shouldReturnTheTaxPercentageForImportedItems() {
        Parser parser = new Parser("1 imported box of chocolates at 10.00");

        assertEquals(10.5, parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForNonImportedItems() {
        Parser parser = new Parser("1 music CD at 14.99");

        assertEquals(16.49, parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForNonImportedItemsAndFoodItems() {
        Parser parser = new Parser("1 chocolate bar at 0.85");

        assertEquals(new Double(0.85), parser.calculateTax(),0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForNonImportedItemsAndMedicalItems() {
        Parser parser = new Parser("1 packet of headache pills at 9.75");

        assertEquals(new Double(9.75), parser.calculateTax(),0.00d);
    }
}
