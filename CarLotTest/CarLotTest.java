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



package CarLotTest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Car.Car;
import CarLot.CarLot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Represents a test class for the CarLot.*/
public class CarLotTest {
	 /** Instance variable to store the CarLot*/
    private CarLot carlot;
    /**
     * Constructs a CarLotTest object with a new CarLot instance.
     */
    public CarLotTest() {
        this.carlot = new CarLot();
    }

    /**
     * Reads the car inventory from a CSV file and adds cars to the CarLot.
     */
    public void InventoryCar() {
        try (Scanner sc = new Scanner(new File("car_inventory.csv"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");
                try {
                    int year = Integer.parseInt(values[0].trim());
                    String make = values[1].trim();
                    String licensePlate = values[2].trim();
                    Car newCar = new Car(year, make, licensePlate);
                    carlot.addCarToLot(newCar);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * Reads license plates from a file and returns an array of license plates.
     *
     * @return An array of license plates.
     */
    private String[] readLPlates() {
        String[] licensePlates = new String[20];
        try (Scanner scanner = new Scanner(new File("car_search.txt"))) {
            int j = 0;
            while (scanner.hasNextLine() && j < 20) {
                licensePlates[j] = scanner.nextLine().trim();
                j++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return licensePlates;
    }

    /**
     * Main method to run the CarLotTest.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        CarLotTest test = new CarLotTest();
        LocalDateTime currentDateTime = LocalDateTime.now();

		// Format the date and time using a specific pattern
		DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDandT = currentDateTime.format(datetimeformatter);

		test.InventoryCar();
		System.out.println("Honest AC's Used Car Lot Inventory for " + formattedDandT);
		String[] array = test.readLPlates();
		for (int i = 0; i < array.length; i++) {
		    String LPlatetofind = array[i];
		    try {
		        Car foundCar = test.carlot.getCarByLicensePlate( LPlatetofind);

		        if (foundCar != null) {
		            // Car with the specified license plate found
		            System.out.println(foundCar.getLicensePlate() + "    " + foundCar.getYear() + "    " + foundCar.getMake());
		        } else {
		            // Car with the specified license plate not found
		            System.out.println( LPlatetofind + "                    Not Found");
		        }
		    } catch (Exception e) {
		        // Handle specific exceptions or log the error
		        System.err.println("Error processing license plate: " +  LPlatetofind);
		        e.printStackTrace();
		    }
		}
    }
}
