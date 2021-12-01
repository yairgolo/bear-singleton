package com.yair;


import com.yair.model.Bear;
import com.yair.model.BearFactory;
import com.yair.model.BearType;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        BearFactory instance = new BearFactory().getInstance();
        Bear bear = instance.createBear(BearType.PandaBear);
        System.out.println(bear);
    }
}
