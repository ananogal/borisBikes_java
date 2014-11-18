Boris Bikes
============

Learning Java: Make Boris Bikes Project in java

What to do:
============

We are creating a simple system for managing Boris Bikes in London.<br/>
Our system will keep track of a number of docking stations and the bikes.<br/>
It will allow you to rent the bikes and return them.<br/>
Occasionally the bikes will break and then they will be unavailable for rental.<br/>
There will also be a garage to fix the bikes and a van to move the bikes between the stations and the garage.<br/>

Session With <a href="https://github.com/ecomba" title="Enrique Comba Riepenhausen">
====================
In this session Enrique taught us, what is an abstract class and an interface.<br/>

We developed a Bike(abstract class), that was extended by WorkingBike and BrokenBike.

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
    