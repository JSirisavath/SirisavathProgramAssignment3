package defaultPackage;

public class PizzaOrderedListDriver {

	public static void main(String[] args) {
		 // Creating an instance of the PizzaOrderedList
        PizzaOrderedList orderedList = new PizzaOrderedList();

        // --- TEST 1: Test add(Pizza element) ---
        System.out.println("=== TEST 1: Add Pizzas (Alphabetical Order) ===");
        Pizza pizza1 = new Pizza("Pepperoni", 2);
        Pizza pizza2 = new Pizza("Margherita", 1);
        Pizza pizza3 = new Pizza("Hawaiian", 3);

        orderedList.add(pizza1);
        orderedList.add(pizza2);
        orderedList.add(pizza3);
        orderedList.display();


        // --- TEST 2: Test size() ---
        System.out.println("\n=== TEST 2: List Size ===");
        System.out.println("Size of list: " + orderedList.size());


        // --- TEST 3: Test add(int index, Pizza element) ---
        System.out.println("\n=== TEST 3: Add at Specific Index ===");
        Topping topping1 = new Topping("Olives", "Margherita", 1, 2);
        orderedList.add(2, topping1);  // Add topping at index 2
        orderedList.display();

        // --- TEST 4: Test remove by Pizza ---
        System.out.println("\n=== TEST 4: Remove Pizza by Object ===");
        orderedList.remove(pizza1); 
        orderedList.display();

        // --- TEST 5: Test remove(int index) ---
        System.out.println("\n=== TEST 5: Remove by Index ===");
        orderedList.remove(1); 
        orderedList.display();
 
        // --- TEST 6: Test indexOf() ---
        System.out.println("\n=== TEST 6: Find Index of Pizza ===");
        System.out.println("Index of Margherita: " + orderedList.indexOf(pizza2)); 


        // --- TEST 7: Test get(int index) ---
        System.out.println("\n=== TEST 7: Get Pizza at Index ===");
        Pizza pizzaAtIndex = orderedList.get(1); 
        System.out.println("Pizza at index 1: " + pizzaAtIndex);
    

        // --- TEST 8: Test adding another pizza ---
        System.out.println("\n=== TEST 8: Add Another Pizza and Check Order ===");
        Pizza pizza4 = new Pizza("Veggie", 4);
        orderedList.add(pizza4);
        orderedList.display();

	}

}
