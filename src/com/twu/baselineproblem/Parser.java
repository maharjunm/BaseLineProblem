package com.twu.baselineproblem;

import static java.lang.Math.*;

public class Parser {
    private String item;

    public Parser(String item) {
        this.item = item;
    }

    public double calculateTax() {
        if (item.contains("imported") ) {
            if(item.contains("chocolate")) {
                String[] list = item.split(" ");
                double rate = Double.parseDouble(list[list.length - 1]);

                Item itemType = new ImportedExtemptionItems();
                return getFinalRate(rate, itemType);
            }
            String[] list = item.split(" ");
            double rate = Double.parseDouble(list[list.length - 1]);

            Item itemType = new ImportedOtherGoods();
            return getFinalRate(rate, itemType);
        }
        if (item.contains("chocolate") || item.contains("pills") || item.contains("book")) {
            String[] list = item.split(" ");
            double rate = Double.parseDouble(list[list.length - 1]);

            Item itemType = new TaxExemptionGoods();
            return getFinalRate(rate, itemType);
        }
        String[] list = item.split(" ");
        double rate = Double.parseDouble(list[list.length - 1]);

        Item itemType = new OtherNonImportedGoods();
        return getFinalRate(rate, itemType);
    }

    private double getFinalRate(double rate, Item itemType) {
        TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
        double finalRate = taxCalculator.calculateTax() + rate;
        finalRate = round(finalRate * 100) / 100.0;

        return finalRate;
    }
}
