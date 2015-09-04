//Other non imported goods have 10% tax
package com.twu.baselineproblem;

public class OtherNonImportedGoods implements Item {
    private final int taxPercent = 10;

    public int getTaxPercent() {
        return taxPercent;
    }
}
