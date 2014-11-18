package com.makersacademy.entities;

/**
 * Created by ananogal on 18/11/2014.
 */
public abstract class  Bike {

    Bike bike;

    public boolean isBroken() {
        return this instanceof BrokenBike;
    }

    public Bike smash(){
        return new BrokenBike(this);
    }

    public Bike repair() {
        return bike;
    }

    public abstract void ride()throws Exception;
}
