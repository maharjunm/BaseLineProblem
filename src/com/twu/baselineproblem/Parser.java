package com.twu.baselineproblem;

public class Parser {
    private String item;

    public Parser(String item) {
        this.item = item;
    }

    public double calculateTax() {
        if (item.contains("imported")) {
            Item itemType = new ImportedItems();

        }

        return 0;
    }
}
