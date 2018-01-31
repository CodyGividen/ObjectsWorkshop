package com.company;

public class Dog {

    private  boolean water;
    private  int foodInBowl;
    private String eyes;
    public Dog(boolean water, int foodInBowl, String eyes){
        this.water = water;
        this.foodInBowl = foodInBowl;
        this.eyes = eyes;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
