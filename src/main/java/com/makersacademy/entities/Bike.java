package com.makersacademy.entities;

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
