package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

public class ImportedExtemptionItemsTest {

    @Test
    public void shouldReturnTaxAs5() {
        ImportedExtemptionItems importedExtemptionItems = new ImportedExtemptionItems();

        Assert.assertEquals(5,importedExtemptionItems.getTaxPercent());
    }
}
