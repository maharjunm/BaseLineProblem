//Tax Exemption Goods have 0% Tax
package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxExemptionGoodsTest {

    @Test
    public void shouldReturnTheTaxAsZeroForExemptionGOODs() {
        TaxExemptionGoods taxExemptionGoods = new TaxExemptionGoods();

        assertEquals(0, taxExemptionGoods.getTaxPercent());
    }
}
