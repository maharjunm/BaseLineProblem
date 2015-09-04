package com.twu.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

public class OtherNonImportedGoodsTest {

    @Test
    public void shouldReturnTaxPercentAs10() {
        OtherNonImportedGoods otherNonImportedGoods = new OtherNonImportedGoods();

        Assert.assertEquals(10,otherNonImportedGoods.getTaxPercent());
    }
}