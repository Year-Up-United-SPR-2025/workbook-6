package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<FixedAsset> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<FixedAsset>();
    }

    public void add(FixedAsset asset){
        this.assets.add(asset);
    }

    public double getValue(){
        double total = 0;
        for (FixedAsset fa : assets){
            total += fa.getValue();
        }
        return total;
    }
}
