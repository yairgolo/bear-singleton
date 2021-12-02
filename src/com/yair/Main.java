package com.yair;


import com.yair.model.Bear;
import com.yair.model.BearFactory;
import com.yair.model.BearType;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Bear b1 = BearFactory.getInstance().createBear(BearType.PandaBear);
        BearFactory bearFactory = BearFactory.getInstance();
        Bear b2 = bearFactory.createBear(BearType.PandaBear);
    }
}
