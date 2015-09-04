package com.twu.baselineproblem;

public class TaxCalculator {

    private double rate;
    private int tax;

    public TaxCalculator(int tax, double rate) {
        this.tax = tax;
        this.rate = rate;
    }

    public double calculateTax() {
        return ( tax * rate ) / 100;
    }
}
