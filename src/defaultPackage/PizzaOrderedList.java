package defaultPackage;

 public class PizzaOrderedList {
	 // Reference variable to the head of the linked list
	 private PizzaNode head;
	 
	 // Reference variable to the tail of the linked list.
	 private PizzaNode tail;
	 
	 
	 
	 // A no-argument constructor to construct an empty list
	 public PizzaOrderedList() {
		 this.head = null;
		 
		 this.tail = null;
	 }
	 
	 
	 // Add pizza data to the pizza node list
	public boolean add(Pizza element) {
		// Create a new pizza node with pizza data
		PizzaNode nodeToAdd = new PizzaNode(element, null);
		
		
		// if node list is empty, add the variable "nodeToAdd" to the list
		if (head == null) {
			head = nodeToAdd;
			
			tail = nodeToAdd;
			
			return true;
		}
		
		// If the node needs to be added first in the head based on order of alphabetical, use the compareTo method from the given element and the current head node
		// if the return INT value is less than 0, the pizza name, it comes before the pizza name that is currently in the head node. Vice versa with greater than 0
		if (element.getPizzaName().compareTo(head.getPizzaData().getPizzaName()) < 0) {
				
				nodeToAdd.setLink(head);
				
				head = nodeToAdd; // Head is the new pizza data to add in list
				
				return true;
		}
		
		// Look through the linked list and find where to add the node
		PizzaNode location = head;
		
		while (location.getLink() !=null && element.getPizzaName().compareTo(location.getLink().getPizzaData().getPizzaName()) > 0) {
			location = location.getLink();
		}
		
		// Node to add points to the next node after the location variable node (node to add -> the node position after location node
		nodeToAdd.setLink(location.getLink());
		
		location.setLink(nodeToAdd); // location node is now the new node that we added
	
		
		// When a new node is added to end, update the tail. Null means the end in this case, next node is empty essentially or no data after this node
		if (nodeToAdd.getLink() == null ) {
			tail = nodeToAdd;
		}
		return true;
	}

	
	
	// Size - returns size of nodes in list
	public int size() {
		int linkSize = 0;
		
		PizzaNode location = head;
		
		while (location != null) {
			linkSize++;
			location = location.getLink(); // update link of location var
		}
		return linkSize;
	}
	
	
	// display contents of list
	public void display() {
		PizzaNode location = head;
		
		
		while(location != null) {
			Pizza pizza = location.getPizzaData();
			
			System.out.println(pizza.getPizzaName() + "\t" + pizza.toString());
			
			location = location.getLink();
		}
	}
	
	
	// Adds an element to the list at the given index where the head node is at index 1
	public boolean add(int index, Pizza element) {

       PizzaNode newNode = new PizzaNode(element, null);

        // If inserting at the head
        if (index == 1) {
            newNode.setLink(head);
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return true;
        }

        PizzaNode location = head;
        int currentIndex = 1;

        // Traverse to the correct position
        while (location != null && currentIndex < index - 1) {
        	location = location.getLink();
            currentIndex++;
        }

        // If we reach the end of the list, add it as the last
        if (location == null) {
            return false;
        }

        newNode.setLink(location.getLink());
        location.setLink(newNode);

        //  Update tail if new node is last
        if (newNode.getLink() == null) {
            tail = newNode;
        }

        return true;
	}
	
	
	// Remove pizza given the target
	public boolean remove(Pizza target) {
		if (head == null) {
			return false;
		}
		
		PizzaNode location = head;
		
		// Search and find the given pizza target
		while (location.getLink() != null && !location.getLink().getPizzaData().equals(target)) {
			location = location.getLink(); // Set location to that node using getLink method
		}
		
		// When found, remove that target
		if (location.getLink() != null) {
			location.setLink(location.getLink().getLink());
			
			if (location.getLink() == null) {
				tail = location;
			}
			
			return true;
		}
		
		return false;
	}
	
	
	// Removes the item located at position index in the list where the head node is at index 1
	public boolean remove(int index) {
        PizzaNode location = head;
        int currentIndex = 1;

        // finding the location before the given index
        while (location != null && currentIndex < index - 1) {
        	location = location.getLink();
            currentIndex++;
        }

        if (location == null || location.getLink() == null) {
            return false;
        }

        // Remove the node
        location.setLink(location.getLink().getLink());

        // If we removed the tail node, update the tail
        if (location.getLink() == null) {
            tail = location;
        }

        return true;
	}
	
	// Returns the index of the first occurrence of target if any
	public int indexOf(Pizza target) {
		 PizzaNode location = head;
	     int currentIndex = 1;
	     
	     while (location != null) {
	    	 if (location.getPizzaData().equals(target)) {
	    		 return currentIndex;
	    	 }
	    	 
	    	 location = location.getLink();
	    	 
	    	 currentIndex++;
	     }
	     
	     return -1; // pizza not found
	}
	
	// Returns the item at position index in the list 
	public Pizza get(int index) {
		if(index < 1 || index >size()) {
			return null;
		}
		
		PizzaNode location = head;
	    int currentIndex = 1;
	    
	    // Search through the list while location is not null and current index is below given index
	    // Add to current index counter
	    while (location !=null && currentIndex < index) {
	    	location = location.getLink();
	    	currentIndex++;
	    }
	    
	    // If the location is not null, return pizza data at that location, else return null
	    if (location != null) {
	    	return location.getPizzaData();
	    } else {
	    	return null;
	    }
	}
	
	
}
 
 
 
