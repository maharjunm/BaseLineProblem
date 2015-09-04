package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedItemsTest {

    @Test
    public void shouldReturnTheTaxPercentAs5() {
        ImportedItems importedItems = new ImportedExtemptionItems();

        assertEquals(5,importedItems.getTaxPercent());
    }
}
