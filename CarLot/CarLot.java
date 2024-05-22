/**
 * CET - CS Academic Level 3
 * Declaration: I declare that this is my own original work and is free from Plagiarism
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jeffin Tom
 * Student Number:   041094535    
 * Section #:   310
 * Course: CST8130 - Data Structures
 * Professor: George Kriger. 
 * 
 */


package CarLot;

import Car.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a Car Lot with methods to manage a collection of cars.
 */
public class CarLot {
/** HashMap to store cars with license plates as keys**/
    private Map<String, Car> LogCar;

    /**
     * Constructs a CarLot object, initializing the inventory with an empty HashMap.
     */
    public CarLot() {
        LogCar = new HashMap<>();
    }


    /**
     * Adds a car to the car lot.
     *
     * @param car The car to be added to the lot.
     */
    public void addCarToLot(Car car) {
    	LogCar.put(car.getLicensePlate(), car);
    }

    /**
     * Retrieves a car from the car lot based on the license plate.
     *
     * @param licensePlate The license plate of the car to retrieve.
     * @return The car with the specified license plate, or null if not found.
     */
    public Car getCarByLicensePlate(String licensePlate) {
        return LogCar.get(licensePlate);
    }
}
