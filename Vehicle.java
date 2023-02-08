/**
 * Vehicle
 * ? custom vehicle class -> use to create vehicle objects
 */
// public keyword makes this class accessible anywhere in our project 
// this is like a blueprint of the vehicle
// Everytime Instantiate this class -> Java will use this blueprint -> to allocate space in memory for our object
public class Vehicle {
    // these are attributes -> what a car comes w/
    public String make;
    public String model;
    public String color;
    public int year;
    
    //? constructor -> used each time we instantiate our class -> program will prompt params we need 
    
    public Vehicle(String make, String model, String color, int year) {
        // this refers to the attributes of our class
        // use it since passing in params and need to set our values = to those params
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}