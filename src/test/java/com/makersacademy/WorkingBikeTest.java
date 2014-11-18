package com.makersacademy;

import com.makersacademy.entities.WorkingBike;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class WorkingBikeTest {

    WorkingBike bike;

    @Before
    public void setup() {
        bike = new WorkingBike();
    }

    @Test
    public void isNotBroken(){
        assertFalse(bike.isBroken());
    }

    @Test
    public void canBrake(){
        assertTrue(bike.smash().isBroken());
    }

    @Test
    public void canBeBrokenMoreTimes(){
        assertFalse(bike.smash().smash().repair().repair().isBroken());
    }

    @Test public void canBeRidden(){
        bike.ride();
        assertTrue(bike.isMoving());
    }
}
