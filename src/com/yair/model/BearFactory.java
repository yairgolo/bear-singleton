package com.yair.model;

import java.util.Random;

enum BearType{
    PolarBear,
    GrizzlyBear,
    PandaBear
}
public class BearFactory {
    private static BearFactory instance;

    public static BearFactory getInstance() {
        if (instance == null) {
            instance = new BearFactory();
        }
        return instance;
    }
    private BearFactory() {}

    public Bear createBear(BearType bearType){
        Random rnd = new Random();
        if (bearType == BearType.PolarBear){
            return new PolarBear(rnd.nextInt(30), (int) (Math.random()*201)+100);
        } else if (bearType == BearType.GrizzlyBear){
            return new GrizzlyBear(rnd.nextInt(30),(int) (Math.random()*201)+100);
        } else {
            return new PandaBear(rnd.nextInt(30), (int) (Math.random()*201)+100);
        }
    }
}



























/*
public class BearFactory {
    private static BearFactory instance;


    public BearFactory getInstance(){
        instance = new BearFactory();
        return instance;
    }
    private BearFactory(){}

    public Bear createBear(BearType bearType){
        Random rnd = new Random();
        if (bearType == BearType.PolarBear){
            return new PolarBear(rnd.nextInt(30), (int) (Math.random()*201)+100);
        } else if (bearType == BearType.GrizzlyBear){
            return new GrizzlyBear(rnd.nextInt(30),(int) (Math.random()*201)+100);
        } else {
            return new PandaBear(rnd.nextInt(30), (int) (Math.random()*201)+100);
        }
    }
}*/