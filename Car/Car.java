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
/**
 * Represents a Car with attributes such as year, make, and license plate.
 * This class is part of the Car package.
 *
 * @author Jeffin Tom
 */
package Car;

/**
 * Represents a Car with variables year, make and licenseplate
 */
public class Car {
	/** Year of the car**/
    private int year;
    /** Make of the car**/
    private String make;
    /** license plate of the car**/
    private String licensePlate;  

    /**
     * Constructs a Car object with the specified year, make, and license plate.
     *
     * @param year         The year of the car.
     * @param make         The make or manufacturer of the car.
     * @param licensePlate The license plate of the car.
     */
    public Car(int year, String make, String licensePlate) {
        this.year = year;
        this.make = make;
        this.licensePlate = licensePlate;
    }

    /**
     * Gets the year of the car.
     *
     * @return The year of the car.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the make or manufacturer of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }
    /**
     * Gets the license plate of the car.
     *
     * @return The license plate of the car.
     */
    public String getLicensePlate() {
        return licensePlate;
    }
}
