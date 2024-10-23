package defaultPackage;

import java.io.*;
import java.util.Scanner;

// Run this file through configurations and select default package e.g ${workspace_loc:SirisavathProgramAssignment3/src/defaultPackage}
public class PizzasTypesListsDriver {

	public static void main(String[] args) {
		 // Create an instance of PizzaTypesLists
        PizzasTypesLists pizzaTypesLists = new PizzasTypesLists();

        // Ask the user for the path of the data file
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the path of the pizza data file: ");
        String filePath = input.nextLine();
        File dataFile = new File(filePath);

        // Load data from the file
        loadPizzasFile(dataFile, pizzaTypesLists);

    }

    // Helper method to load the pizza data file
    public static void loadPizzasFile(File file, PizzasTypesLists pizzaTypesLists) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processFile(line, pizzaTypesLists);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Helper method to process each line of the file
    public static void processFile(String nextLine, PizzasTypesLists pizzaTypesLists) {
        String[] parts = nextLine.split("\\t");

        int type = Integer.parseInt(parts[0]);
        String pizzaName = parts[1];
        int numberOfPizza = Integer.parseInt(parts[2]);

        switch (type) {
            case 1: // Topping
                int extraToppingQuantity = Integer.parseInt(parts[3]);
                Topping topping = new Topping(pizzaName, pizzaName, numberOfPizza, extraToppingQuantity);
                pizzaTypesLists.add(topping);
                break;

            case 2: // StuffedCrust
                boolean isStuffedCrust = Boolean.parseBoolean(parts[3]);
                int cheeseQuantityToAdd = Integer.parseInt(parts[4]);
                StuffedCrust stuffedCrust = new StuffedCrust(pizzaName, numberOfPizza, isStuffedCrust, cheeseQuantityToAdd);
                pizzaTypesLists.add(stuffedCrust);
                break;

            default:
                System.out.println("Unknown item type: " + type);
        }
	}
	
}