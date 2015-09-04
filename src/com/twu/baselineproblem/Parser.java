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
                TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
                double finalRate = taxCalculator.calculateTax() + rate;
                finalRate = round(finalRate * 100) / 100.0;

                return finalRate;
            }
            String[] list = item.split(" ");
            double rate = Double.parseDouble(list[list.length - 1]);

            Item itemType = new ImportedOtherGoods();
            TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
            double finalRate = taxCalculator.calculateTax() + rate;
            finalRate = round(finalRate * 100) / 100.0;

            return finalRate;
        }
        if (item.contains("chocolate") || item.contains("pills") || item.contains("book")) {
            String[] list = item.split(" ");
            double rate = Double.parseDouble(list[list.length - 1]);

            Item itemType = new TaxExemptionGoods();
            TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
            double finalRate = taxCalculator.calculateTax() + rate;
            finalRate = round(finalRate * 100) / 100.0;

            return finalRate;
        }
        String[] list = item.split(" ");
        double rate = Double.parseDouble(list[list.length - 1]);

        Item itemType = new OtherNonImportedGoods();
        int tax = 0;
        TaxCalculator taxCalculator = new TaxCalculator(itemType.getTaxPercent(), rate);
        double finalRate = taxCalculator.calculateTax() + rate;
        finalRate = round(finalRate * 100) / 100.0;
        System.out.println(finalRate);

        return finalRate;
    }
}
