package com.yair.model;

public class GrizzlyBear extends Bear {

    public GrizzlyBear(int age, Color color, int weight, boolean isHostile) {
        super(age, color, weight, isHostile);
    }

    public GrizzlyBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {
        System.out.println("the grizzly bear is eating");
    }
    public void mate(GrizzlyBear grizzlyBear){
        System.out.println("the grizzly bear is mate of " + grizzlyBear);
    }
    public void hunt(){
        System.out.println("the grizzly is hunting");
    }
}
