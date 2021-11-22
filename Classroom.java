// Write a class Classroom that extends Room.  A Classroom class contains
// an int instance variable for the number of chairs in the classroom
// a constructor that takes the area of the classroom as a parameter
// a constructor that takes the area of the classroom and the number of chairs as parameters
// getter and setter for chairs
// an override for getCapacity.  The capacity of a classroom is the number of chairs.
// an accessor, String toString() that returns the square feet and capacity of the room as well as the number of chairs.


public class Classroom extends Room{
    
    private int chairs = 0;

    // no args constructor
    public Classroom(){

    }

    // constructor with area variable to be passed to the parent class
    public Classroom(int area){
        super(area);
    }

    // constructor with area for the parent class and the chairs variable for the current (sub) class
    public Classroom(int area, int chairs){
        super(area);
        this.chairs = chairs;
    }

    // getter or accessor
    public int getChairs() {
        return this.chairs;
    }

    // setter or mutator
    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    @Override // the same method in parent class Room
    public int getCapacity(){
        return getChairs();
    }

    @Override // the same method in parent class Room
    public String toString(){
        return "The classroom has an area of: " + super.getSquareFeet() + " square feet and a capacity of " + getCapacity() + " chairs.";
    }
}
