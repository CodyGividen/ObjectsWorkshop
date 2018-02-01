package com.company;

public class Main {

    public static void main(String[] args){
//        Cat cat = new Cat(100, true, "Calico");
//        Dog dog = new Dog(true, 100, "blue");
//        System.out.println(cat.getColor());
        Pencil pencil = new Pencil(.7, "Dixon", true,"Orange", false);
        Pencil pencil1 = new Pencil(.8, "paper-mate", true,"Yellow", false);

        System.out.println("this is pencil:   "pencil.getColor());
        System.out.println("this is pencil1:   " pencil1.getColor());
    }
}
