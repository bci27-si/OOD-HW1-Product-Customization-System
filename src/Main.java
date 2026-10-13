
public class Main {

    public static void main(String[] args) {

        System.out.println("Main Method running");


    }
}


/*
Patterns:
Builder - devices must have the ability to be customizable, many devices


 */

/*

Problem3: Product Customization and External Integration System
Overview
You are tasked with creating a product customization and integration system for a fictional online store.
The system should allow customers to customize their products (e.g., laptops, smartphones) by selecting various specifications, and it should also retrieve product details from an external supplier’s database (in the form of a CSV file). The CSV file contains information about the default product models and their prices, which needs to be integrated into your system.
Hint : 2 patterns needed.
Requirements
Product Customization:
Customers should be able to customize various products (e.g., laptops, smartphones) by selecting different specifications such as:
    Laptops:
        - Processor type,
        - RAM size,
        - storage size,
        - graphics card, and
        - operating system.

    Smartphones:
        - Screen size,
        - processor type,
        - camera resolution,
        - battery size, and
        - storage size.

Each product should have customizable attributes that can be selected step-by-step.
All custom products are set to a fixed price of $800

CSV Product Information Retrieval:
The system should retrieve the default product details (e.g., basic specifications and pricing) from an external CSV file provided by a third-party supplier.
The CSV file will contain information such as:
    - Product name
    - Default specifications
    - Pricing

Integration:
The CSV file may contain product data in a different format than your internal system.
You need to adapt the CSV data to work seamlessly with your internal product representation.

After retrieving and adapting the data from the CSV file,
    - display both the customer’s customized
        - product details and the
        - default product details (from the CSV file) for comparison.
Modularity:
Your system should be flexible enough to easily add new types of products in the future without requiring major changes to the codebase.

Task Requirements
Product Customization:
Design a mechanism that allows customers to customize a product step-by-step, selecting different attributes.
Once all attributes are selected, the system should create a fully configured product and display the details.
CSV Product Information Retrieval:
Design the system to retrieve product information from a CSV file that contains default specifications and pricing.
The system must be able to handle the CSV format and convert it to your internal product format.
Integration:
Create a system that displays both the customized product and the default product from the external supplier (CSV data) side by side for comparison.
Sample CSV
Submission Requirements:
Provide the full source code for your implementation, including a test case
Include a short explanation of your design choices
UML Diagrams:
Create UML diagrams that represent your system's design.
These diagrams should illustrate the relationships between classes and how the design patterns are applied in your implementation.

Extra Credit [+5] : The stretch goal requires updating the logic to compare the custom product specifications with the default specifications in the CSV file, and if the custom product matches the Processor, RAM, and Storage of any product in the CSV, the system will adjust the price of the custom product to match that of the closest matching product in the CSV.


 */