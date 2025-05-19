package com.pluralsight;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();


}
