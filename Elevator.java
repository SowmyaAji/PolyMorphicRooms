// Write a class Elevator that extends Room.  An Elevator class contains
// an int instance variable for the current floor of the elevator
// a getter for floor
// a constructor that takes the area of the elevator as a parameter
// a mutator void up(int floors) that increases the current floor by the parameter
// a mutator void down(int floors) that decreases the current floor by the parameter
// an accessor String toString() that returns the square feet and capacity of the elevator, as well as its current floor.

public class Elevator  extends Room{

    private int floor = 0;

    // no args constructor
    public Elevator(){}

    // constructor with area variable passed to the parent class
    public Elevator(int area){
        super(area);
    }


    // getter or accessor
    public int getFloor() {
        return this.floor;
    }

    // class methods
    public void up(int floors) {
        this.floor += floors;
    }

    public void down(int floors){
        this.floor -= floors;
    }


    @Override // the same method in parent class Room
    public String toString(){
        return "The elevator with an area of: " + super.getSquareFeet() + " square feet and a capacity of: " + super.getCapacity() + ", is currently at floor number: " + getFloor();
    }

    
}
