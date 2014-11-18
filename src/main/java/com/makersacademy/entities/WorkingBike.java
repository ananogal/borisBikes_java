package com.makersacademy.entities;

public class WorkingBike extends Bike{

    private boolean riding = false;

    @Override
    public void ride() {
        riding = true;
    }

    public boolean isMoving(){
        return riding;
    }

}
