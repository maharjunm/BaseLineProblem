//Imported Goods has 5% Tax
package com.twu.baselineproblem;

public class ImportedItems implements Item {
    private final int taxPercent = 5;

    public int getTaxPercent() {
        return taxPercent;
    }
}
