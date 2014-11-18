package com.makersacademy.entities;

public class BrokenBike extends Bike{

    public BrokenBike(Bike bike){
        this.bike = bike;
    }

    @Override
    public void ride() throws Exception {
        throw new Exception();
    }
}
