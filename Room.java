// Attached Files:
// File CSC151_Unit13_LabInheritStarter.zip (593 B)
// The attached file contains starter code for a class Building that you should use as a driver for the following set of classes.
// Write a class Room.  A Room class contains
// an int instance variable for the area (in square feet) of the room
// one constructor that takes the area of the room as a parameter
// an accessor, int getSquareFeet() that returns the area of the room
// a mutator, setSquareFeet(int area) that sets the square feet of the room
// an accessor, int getCapacity() that returns the capacity of the room.  The capacity is given by dividing the square feet by 9 (using integer division).
// an accessor, String toString() that returns the square feet and capacity of the room.

// Write a class Classroom that extends Room.  A Classroom class contains
// an int instance variable for the number of chairs in the classroom
// a constructor that takes the area of the classroom as a parameter
// a constructor that takes the area of the classroom and the number of chairs as parameters
// getter and setter for chairs
// an override for getCapacity.  The capacity of a classroom is the number of chairs.
// an accessor, String toString() that returns the square feet and capacity of the room as well as the number of chairs.

// Write a class Elevator that extends Room.  An Elevator class contains
// an int instance variable for the current floor of the elevator
// a getter for floor
// a constructor that takes the area of the elevator as a parameter
// a mutator void up(int floors) that increases the current floor by the parameter
// a mutator void down(int floors) that decreases the current floor by the parameter
// an accessor String toString() that returns the square feet and capacity of the elevator, as well as its current floor.

// Grading Elements
// Room, Classroom and Elevator each have the specified instance variables
// Room, Classroom and Elevator each have their specified methods with the exact names, signatures and return types
// Classroom and Elevator are subclasses of Room
// Classroom and Elevator exploit Room as much as possible
// No accessors modify object state
// Each class calculates capacity as specified
// The given Building class should be modified to work with Room and its subclasses


// Write a class Room.  A Room class contains
// an int instance variable for the area (in square feet) of the room
// one constructor that takes the area of the room as a parameter
// an accessor, int getSquareFeet() that returns the area of the room
// a mutator, setSquareFeet(int area) that sets the square feet of the room
// an accessor, int getCapacity() that returns the capacity of the room.  The capacity is given by dividing the square feet by 9 (using integer division).
// an accessor, String toString() that returns the square feet and capacity of the room.

public class Room{

    private int area = 0;
    
    // no args constructor
    public Room(){

    }

    // constructor with variable area
    public Room(int area){
        this.area = area;
    }

    // getter or accessor
    public int getSquareFeet(){
        return this.area;
    }

    public int getCapacity(){
        int sqFt = getSquareFeet();
        return sqFt / 9;
    }


    // setter or mutator
    public void setSquareFeet(int area){
        this.area = area;
    }

   
    @Override 
    public String toString(){
        return "The area is: " + getSquareFeet() + " square feet and the capacity is: " + getCapacity();
    }
}