package com.company;

public class Dog {

    private  boolean water;
    private  int foodInBowl;
    private String eyes;

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public int getFoodInBowl() {
        return foodInBowl;
    }

    public void setFoodInBowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public Dog(boolean water, int foodInBowl, String eyes){
        this.water = water;
        this.foodInBowl = foodInBowl;
        this.eyes = eyes;

    }

}
