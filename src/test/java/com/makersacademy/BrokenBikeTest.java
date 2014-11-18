package com.makersacademy;

import com.makersacademy.entities.BrokenBike;
import com.makersacademy.entities.WorkingBike;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.*;

public class BrokenBikeTest {

    BrokenBike bike;
    @Before
    public void setUp(){
        bike = new BrokenBike(new WorkingBike());
    }

    @Test
    public void isBroken(){
        assertTrue(bike.isBroken());
    }

    @Test
    public void canBeRepair(){
        WorkingBike working = new WorkingBike();
        BrokenBike broken = new BrokenBike(bike);
        assertEquals(bike, broken.repair());

    }

    @Test(expected = Exception.class)
    public void canNotBeRidden() throws Exception {
        bike.ride();
    }
}
