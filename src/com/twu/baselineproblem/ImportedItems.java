//Imported Goods has 5% Tax
package com.twu.baselineproblem;

public interface ImportedItems extends Item {
    int taxPercent = 5;
    public int getTaxPercent();
}
