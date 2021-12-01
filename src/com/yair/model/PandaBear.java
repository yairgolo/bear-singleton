package com.yair.model;

public class PandaBear extends Bear{
    public PandaBear(int age, Color color, int weight, boolean isHostile) {
        super(age, color, weight, isHostile);
    }

    public PandaBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {
        System.out.println("the panda bear is eating");
    }
    public void mate(PandaBear pandaBear){
        System.out.println("the panda bear is mate of " + pandaBear);
    }
}
