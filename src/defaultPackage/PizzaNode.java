package defaultPackage;

// Note, the pizza and it's subclass was all copied from my assignment 2 work to this project

public class PizzaNode {
	// Reference pizza class data
	private Pizza pizzaData;
	
	// Reference to next node of the link
	private PizzaNode link;
	
	
	public PizzaNode(Pizza pizzaData, PizzaNode link) {
		this.pizzaData = pizzaData;
		this.link = link;
	}


	// Getters and setters
	public Pizza getPizzaData() {
		return pizzaData;
	}


	public void setPizzaData(Pizza pizzaData) {
		this.pizzaData = pizzaData;
	}


	public PizzaNode getLink() {
		return link;
	}


	public void setLink(PizzaNode link) {
		this.link = link; // updates references to point to a new node instead
	}
	
	
}
