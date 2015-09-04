package com.twu.baselineproblem;

public class ImportedExtemptionItems implements Item, ImportedItems {
    private final int taxPercent = 5;

    public int getTaxPercent() {
        return taxPercent;
    }
}
