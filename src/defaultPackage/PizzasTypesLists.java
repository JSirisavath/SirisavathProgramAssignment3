package defaultPackage;

public class PizzasTypesLists {
	private PizzaOrderedList toppingList;
	
	private PizzaOrderedList stuffedCrustList;
	
	
	public void PizzaTypeLists() {
		this.toppingList = new PizzaOrderedList();
		
		this.stuffedCrustList = new PizzaOrderedList();
	}
	
	
	// Adds element to the correct list
    public void add(Pizza element) {
        try {
            if (element instanceof Topping) {
                toppingList.add(element);  // Add to toppingList
            } else if (element instanceof StuffedCrust) {
                stuffedCrustList.add(element);  // Add to stuffedCrustList
            } else {
                throw new ClassNotFoundException("Element not instance of either subclass.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);  // Terminate the program with an error message
        }
    }
	
	
	// Returns the number of nodes in the given list
	public int sizeOf( PizzaOrderedList iol ) {
		return iol.size();
	}
	
	
	// Displays the contents of the specified list
	public void display( PizzaOrderedList iol ) {
		iol.display();
	}
	
	
	// Adds element to the correct list at the given index where the head node is at index 1
	public boolean add( int index, Pizza element ) {
		// Same as original add method but this is overloaded add function (With index)
		if (element instanceof Topping) {
			return toppingList.add(index, element);
			
			} else if (element instanceof StuffedCrust) {
				return stuffedCrustList.add(index,element);
				
			} else {
				return false;
			}
	}
	
	
	// Removes one occurrence of target if there is at least one instance of target in the correct list
	public boolean remove( Pizza target ) {
		// Same as original add method but uses delete method
		if (target instanceof Topping) {
			return toppingList.remove(target);
			
			} else if (target instanceof StuffedCrust) {
				return stuffedCrustList.remove(target);
				
			} else {
				return false;
			}
	}
	
	
	// Removes the Item located at position index in the <Item>OrderedList iol where the head node is at index 1
	public boolean remove( PizzaOrderedList iol, int index ) {
		return iol.remove(index);
	}
	
	// Returns the index of the first occurrence of target in the appropriate ordered list
	public int indexOf( Pizza target ) {
		// Same as original add method but this uses index of function
		if (target instanceof Topping) {
			return toppingList.indexOf(target);
			} 
		else if (target instanceof StuffedCrust) {
						return stuffedCrustList.indexOf(target); 
						}
		else {
				return -1; // invalid
				}
	}

	
	// Returns the <Item>OrderedList of the given type (‘a’ for <ItemA>OrderedList or ‘b’ for <ItemB>OrderedList)
	public PizzaOrderedList getList( char type ) {
		// make it lower case no matter if upper or not
		if (Character.toLowerCase(type) == 'a') {
			return toppingList;
		} else if (Character.toLowerCase(type) == 'b') {
			return stuffedCrustList;
		} else {
			return null; // invalid
		}
	}
	
	
	// Returns the item at position index in the specified list
	public Pizza get( PizzaOrderedList iol,  int index ) {
		return iol.get(index);
	}
	
	
}
