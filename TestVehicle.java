// import java.text.Format;

/**
 * TestVehicle
 * ? Entry point of oour application
 */
public class TestVehicle {
    
    public static void main(String[] args) {
        // ? where will create an instance of our custom vehicle class
        // -> pass in 4 diff. params -> the year, make, model, color 
        Vehicle newVehicle = new Vehicle("Jeep", "Wrangler", "White", 2023);
        // -> formated string -> using to concatenate all this info
        String myVehicle = String.format("This vehicle is a %d %s %s %s", newVehicle.year, newVehicle.color, newVehicle.make, newVehicle.model);
        // -> print out the newVehicle
        System.out.println(myVehicle);
    }
}