package org.johnrsparks;

public class Item {
    private String name;

    private double cost;

    private int units;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Item() {
    }

    public Item(String name, double cost, int units) {
        this.name = name;
        this.cost = cost;
        this.units = units;
    }
}
