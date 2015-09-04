package com.twu.baselineproblem;

public class TaxExemptionGoods implements Item {
    private final int taxPercent = 0;


    @Override
    public int getTaxPercent() {
        return taxPercent;
    }
}
