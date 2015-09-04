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

        assertEquals(new Double(0.85), parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForNonImportedItemsAndMedicalItems() {
        Parser parser = new Parser("1 packet of headache pills at 9.75");

        assertEquals(new Double(9.75), parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForNonImportedItemsAndBooks() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals(new Double(12.49), parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForImportedItemsAndFoodItems() {
        Parser parser = new Parser("1 box of imported chocolates at 11.25");

        assertEquals(new Double(11.81), parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForImportedItemsAndOtherItems() {
        Parser parser = new Parser("1 imported bottle of perfume at 27.99");

        assertEquals(new Double(32.19), parser.calculateTax(), 0.00d);
    }

    @Test
    public void shouldReturnTheTaxPercentageForImportedItemsAndChocolates() {
        Parser parser = new Parser("1 imported box of chocolates at 10.00");

        assertEquals(new Double(10.50), parser.calculateTax(), 0.00d);
    }
}
