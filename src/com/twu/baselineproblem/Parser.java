package com.twu.baselineproblem;

public class Parser {
    private String item;

    public Parser(String item) {
        this.item = item;
    }

    public double calculateTax() {
        if (item.contains("imported")) {
            String[] list = item.split(" ");
            double rate = Double.parseDouble(list[list.length - 1]);

            Item itemType = new ImportedItems();
            TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
            double finalRate = taxCalculator.calculateTax() + rate;

            return finalRate;
        }

        return 0;
    }
}
