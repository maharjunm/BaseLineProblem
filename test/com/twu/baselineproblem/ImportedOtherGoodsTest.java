package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedOtherGoodsTest {

    @Test
    public void shouldReturnTaxAs15() {
        ImportedOtherGoods importedOtherGoods = new ImportedOtherGoods();

        assertEquals(15, importedOtherGoods.getTaxPercent());
    }
}
