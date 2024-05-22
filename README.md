JT's Used Car Lot Management System
Welcome to Honest AC's Used Car Lot Management System! This project is a simple yet efficient car lot management system designed to help manage the inventory of cars in a used car lot. It includes functionality for adding cars to the lot, retrieving car details based on their license plates, and processing car inventory data from CSV files.

Features
Car Class: Represents individual cars with attributes such as year, make, and license plate.
CarLot Class: Manages a collection of cars using a HashMap for efficient retrieval.
CarLotTest Class: Provides a test suite to read car inventory from a CSV file and search for cars by their license plates.
Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher
An IDE or text editor for Java development
Basic understanding of Java and object-oriented programming
Project Structure
Car/Car.java: Defines the Car class.
CarLot/CarLot.java: Defines the CarLot class.
CarLotTest/CarLotTest.java: Contains the main class for testing the car lot functionality.
Usage
Clone the Repository

bash
Copy code
git clone https://github.com/yourusername/used-car-lot-management.git
cd used-car-lot-management
Compile the Project

Ensure you are in the root directory of the project and run:

bash
Copy code
javac Car/Car.java CarLot/CarLot.java CarLotTest/CarLotTest.java
Run the Test Class

bash
Copy code
java CarLotTest.CarLotTest
Files
car_inventory.csv: Contains the car inventory data in CSV format. Ensure this file is in the root directory or update the file path in the CarLotTest class.
car_search.txt: Contains license plates to search for in the car inventory. Ensure this file is in the root directory or update the file path in the CarLotTest class.
Example CSV and TXT Files
car_inventory.csv
yaml
Copy code
2010,Toyota,ABC123
2015,Honda,XYZ789
2020,Ford,LMN456
car_search.txt
Copy code
ABC123
XYZ789
NOP321
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
This project was developed as part of a course assignment for CST8130 - Data Structures at CET - CS Academic Level 3.
Special thanks to Professor George Kriger for guidance and support.
Contributing
Fork the repository
Create your feature branch (git checkout -b feature/YourFeature)
Commit your changes (git commit -m 'Add some feature')
Push to the branch (git push origin feature/YourFeature)
Open a pull request
For any questions or suggestions, please contact Jeffin Tom.
