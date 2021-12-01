package com.yair.model;

enum Color {
    BLACK,
    WHITH,
    GREY,
    BROWN
}

public abstract class Bear {
    public Bear(int age, Color color, int weight, boolean isHostile) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.isHostile = isHostile;
    }

    public Bear(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    protected int age;
    protected Color color;
    protected int weight;
    protected boolean isHostile;

    public abstract void eat();

    public void sleep(){
        System.out.println("the bear is sleeping");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHostile() {
        return isHostile;
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }
}
