package com.yair.model;

public class PolarBear extends Bear{
    public PolarBear(int age, Color color, int weight, boolean isHostile) {
        super(age, color, weight, isHostile);
    }

    public PolarBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {
        System.out.println("the polar bear is eating");
    }

    public void mate(PolarBear polarBear){
        System.out.println("the polar bear is mate of " + polarBear);
    }
    public void hunt(){
        System.out.println("the polar bear is hunting");
    }
}
