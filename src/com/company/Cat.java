package com.company;

import java.util.Scanner;

public class Cat {

    private int legs;
    private  boolean fur;
    private  String color;
    private Scanner input = input.nextln(;)



    public Cat (){



        System.out.println("What color would you like your cat?");
        setColor(input.nextLine());
        System.out.println("How many legs does your cat have?");
        setLegs(input.nextInt());
        input.nextInt();
        System.out.println("Does your cat have fur?");
        setFur(input.nextBoolean());
//    private Scanner input = new Scanner(System.in);
//    public Cat(int legs,boolean fur, String color)
//    {
//        this.legs = legs;
//        this.fur = fur;
//        this.color = color;

    } public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
